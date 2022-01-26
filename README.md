# SSPanelToV2board
SSPanel数据库转换为V2board数据库

## 运行环境:
- JDK 1.8
- maven 3.8.2

## 数据源配置：
- 修改application.yml配置文件：
- url: jdbc:mysql://你的数据库地址:端口号/数据库名称?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&useSSL=false&allowPublicKeyRetrieval=true
- username: root
- password: 你的数据库root密码

- master：
SSPanel数据库配置
- v2board：
v2board数据库配置

## 开始转换：

- 转换user表
访问http://localhost:8081/SSPanelToV2board/user

- 转换coupon表
访问http://localhost:8081/SSPanelToV2board/coupon

- 转换ss_invite_code表
访问http://localhost:8081/SSPanelToV2board/ss_invite_code

- 转换bought表
访问http://localhost:8081/SSPanelToV2board/bought

- 同时转换以上四个表
访问http://localhost:8081/SSPanelToV2board/all

