#!/bin/bash

##############本地#####################


#将远程的文件copy到本地
scp root@43.134.194.115:/data/Debug/LogicServer/data/config.server.tar.gz /Users/zhulinfeng/Documents/config
tar zxvf /Users/zhulinfeng/Documents/config/config.server.tar.gz -C /Users/zhulinfeng/Documents/config

#将本地文件打包 并上传到远程
cd /Users/zhulinfeng/Documents/config
tar -zcvf config.local.tar.gz config
cd /Users/zhulinfeng/Documents/config
scp config.local.tar.gz root@43.134.194.115:/data/Debug/LogicServer/data

#上传json文件
cd /Users/zhulinfeng/Documents
scp config.json root@43.134.194.115:/www/wwwroot/GameApp2/resource_Publish/cfg


##############本地#####################





##############服务端#####################

# 本地打包config
cd /data/Debug/LogicServer/data
tar -zcvf config.server.0225.tar.gz config

#解压本地上传的文件
cd /data/Debug/LogicServer/data
tar -zxvf config.local.tar.gz


#压缩json
cd /www/wwwroot/GameApp2/resource_Publish/cfg
zip config.xml config.json


#只启动debug
sh /data/Debug/stop.sh && sh /data/Debug/run.sh

##############服务端#####################




##############to 孝杰服务端#####################

#打包本地config上传到孝杰服务器
cd /Users/zhulinfeng/Documents/config
tar -zcvf config.local.tar.gz config
scp -P 6000 config.local.tar.gz root@43.134.194.115:/data/Debug/LogicServer/data

#上传json文件
cd /Users/zhulinfeng/Documents
scp -P 6000 config.json root@43.134.194.115:/www/wwwroot/GameApp2/resource_Publish/cfg

##############to 孝杰服务端#####################


# kill
ps -ef | grep /data/  | grep _r | awk -F ' ' '{print "kill -9 "$2}'

for pid in `ps -ef | grep /data/  | grep _r | awk -F ' ' '{print $2}'`;do kill -9 $pid;done;
