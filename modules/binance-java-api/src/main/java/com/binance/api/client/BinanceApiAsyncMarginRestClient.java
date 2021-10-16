package com.binance.api.client;

import com.binance.api.client.domain.TransferType;
import com.binance.api.client.domain.account.*;
import com.binance.api.client.domain.account.request.CancelOrderRequest;
import com.binance.api.client.domain.account.request.CancelOrderResponse;
import com.binance.api.client.domain.account.request.OrderRequest;
import com.binance.api.client.domain.account.request.OrderStatusRequest;
import com.binance.api.client.domain.event.ListenKey;

import java.util.List;

/**
 * Binance API façade, supporting asynchronous/non-blocking access Binance's Margin REST API.
 */
public interface BinanceApiAsyncMarginRestClient {

  // Account endpoints

  /**
   * Get current margin account information (async).
   */
  void getAccount(Long recvWindow, Long timestamp, BinanceApiCallback<MarginAccount> callback);

  /**
   * Get current margin account information using default parameters (async).
   */
  void getAccount(BinanceApiCallback<MarginAccount> callback);

  /**
   * Get all open orders on margin account for a symbol (async).
   *
   * @param orderRequest order request parameters
   * @param callback the callback that handles the response
   */
  void getOpenOrders(OrderRequest orderRequest, BinanceApiCallback<List<Order>> callback);


  void newOrder(MarginNewOrder order, BinanceApiCallback<MarginNewOrderResponse> callback);


  void cancelOrder(CancelOrderRequest cancelOrderRequest, BinanceApiCallback<CancelOrderResponse> callback);


  void getOrderStatus(OrderStatusRequest orderStatusRequest, BinanceApiCallback<Order> callback);


  void getMyTrades(String symbol, BinanceApiCallback<List<Trade>> callback);

  void startUserDataStream(BinanceApiCallback<ListenKey> callback);

  /**
   * PING a user data stream to prevent a time out (async).
   *
   * @param listenKey listen key that identifies a data stream
   */
  void keepAliveUserDataStream(String listenKey, BinanceApiCallback<Void> callback);

  /**
   * Execute transfer between spot account and margin account
   * @param asset asset to repay
   * @param amount amount to repay

   */
  void transfer(String asset, String amount, TransferType type, BinanceApiCallback<MarginTransaction> callback);


  /**
   *
   * @param asset a
   * @param amount a
   * @param callback a
   */
  void borrow(String asset, String amount, BinanceApiCallback<MarginTransaction> callback);

  /**
   * Repay loan for margin account
   * @param asset asset to repay
   * @param amount amount to repay

   */
  void repay(String asset, String amount, BinanceApiCallback<MarginTransaction> callback);

}