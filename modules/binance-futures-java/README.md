# 개요
* 관련 모듈은 바이낸스 깃허브를 다운받아서 모듈화 해서 사용하고 있습니다
* mavenctrl 에 올라가 있지 않아서 직접 사욯다가 레파지토리를 바꾸면 제외 하는 형식으로 진행하려고 합니다.
* https://github.com/Binance-docs/Binance_Futures_Java

- 관련프로젝트 지원이 더이상 이루어지지 않는것으로 보인다. 개발 리소스 낭비를 방지하기 위해 이후관리는 https://github.com/runonio/cryptocurrency/tree/main/modules/cryptocurrency-exchanges 에서 같이 관리한다.

# gradle
implementation 'io.runon.cryptocurrency:exchange-binance-futures:1.0.92'
- etc
  - https://mvnrepository.com/artifact/io.runon.cryptocurrency/exchange-binance-futures/1.0.92

# Binance Java SDK (beta version)

This is Binance Java SDK, This is a lightweight Java library, you can import to your Java project and use this SDK to query all market data, trading and manage your account.

The SDK supports both synchronous and asynchronous RESTful API invoking, and subscribe the market data from the Websocket connection.


## Table of Contents

- [Beginning](#Beginning)
  - [Installation](#Installation)


## Beginning

### Installation

*The SDK is compiled by Java8*

For Beta version, please import the source code in java IDE (idea or eclipse)

The example code is in binance-api-sdk/java/src/test/java/com/binance/client/examples.

