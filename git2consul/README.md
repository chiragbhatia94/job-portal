```shell script
mkdir -p git2consul.d
cat <<EOF > /tmp/git2consul.d/config.json
{
  "version": "1.0",
  "repos" : [{
    "name" : "job-portal",
    "url" : "https://github.com/chiragbhatia94/job-portal.git",
    "include_branch_name":false,
    "ignore_file_extension" : true,
    "source_root":"consul-config/pdx/dit",
    "mountpoint":"global/chiragbhatia94",
    "branches" : ["develop"],
    "hooks": [{
      "type" : "polling",
      "interval" : "1"
    }]
  }]
}
EOF

docker run -d -p 8400:8400 -p 8500:8500 -p 8600:53/udp --name=consul -e CONSUL_BIND_INTERFACE=eth0 consul
CONSUL_IP=$(docker inspect --format '{{ .NetworkSettings.IPAddress }}' consul) && echo $CONSUL_IP
docker run -d --name git2consul -v $(pwd)/git2consul:/etc/git2consul.d cimpress/git2consul --endpoint $CONSUL_IP --port 8500 --config-file /etc/git2consul.d/config.json
```