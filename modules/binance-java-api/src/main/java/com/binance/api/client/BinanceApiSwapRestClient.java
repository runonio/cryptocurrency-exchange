package com.binance.api.client;

import com.binance.api.client.domain.SwapRemoveType;
import com.binance.api.client.domain.account.*;
import retrofit2.Call;
import retrofit2.http.Query;

import java.util.List;

public interface BinanceApiSwapRestClient {

    /**
     * Get metadata about all swap pools.
     *
     * @return a
     */
    List<Pool> listAllSwapPools();

    /**
     * Get liquidity information and user share of a pool.
     *
     * @param poolId a
     * @return a
     */
    Liquidity getPoolLiquidityInfo(String poolId);

    /**
     * Add liquidity to a pool.
     *
     * @param poolId a
     * @param asset a
     * @param quantity a
     * @return a
     */
    LiquidityOperationRecord addLiquidity(String poolId,
                                          String asset,
                                          String quantity);

    /**
     * Remove liquidity from a pool, type include SINGLE and COMBINATION, asset is mandatory for single asset removal
     *
     * @param poolId a
     * @param type a
     * @param asset a
     * @param shareAmount a
     * @return a
     */
    LiquidityOperationRecord removeLiquidity(String poolId, SwapRemoveType type, List<String> asset, String shareAmount);

    /**
     * Get liquidity operation (add/remove) records of a pool
     *
     * @param poolId a
     * @param limit a
     * @return a
     */
    List<LiquidityOperationRecord> getPoolLiquidityOperationRecords(
            String poolId,
            Integer limit);

    /**
     * Get liquidity operation (add/remove) record.
     *
     * @param operationId a
     * @return a
     */
    LiquidityOperationRecord getLiquidityOperationRecord(String operationId);

    /**
     * Request a quote for swap quote asset (selling asset) for base asset (buying asset), essentially price/exchange rates.
     *
     * @param quoteAsset a
     * @param baseAsset a
     * @param quoteQty a
     * @return a
     */
    SwapQuote requestQuote(String quoteAsset,
                           String baseAsset,
                           String quoteQty);

    /**
     * Swap quoteAsset for baseAsset
     *
     * @param quoteAsset a
     * @param baseAsset a
     * @param quoteQty a
     * @return a
     */
    SwapRecord swap(String quoteAsset,
                    String baseAsset,
                    String quoteQty);

    SwapHistory getSwapHistory(String swapId);
}
