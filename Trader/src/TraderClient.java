import com.binance.api.client.*; // BinanceApiClientFactory, BinanceApiRestClient
import com.binance.api.client.domain.*; // OrderSide, OrderType, TimeInForce
import com.binance.api.client.domain.account.*; // AssetBalance, NewOrder, NewOrderResponse, Order
import com.binance.api.client.domain.account.request.*; // CancelOrderRequest, OrderRequest, OrderStatusRequest
import com.binance.api.client.domain.market.OrderBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TraderClient 
{
	private static Logger logger = LoggerFactory.getLogger(TraderClient.class);
	private BinanceApiRestClient client; // used to communicate with binance-api
	private String baseCurrency;
	private String tradeCurrency;
	private String symbol;

	TraderClient(String bCurrency, String tCurrency, String key, String secret)
	{
		this.baseCurrency = bCurrency;
		this.tradeCurrency = tCurrency;
		BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(key, secret);
		client = factory.newRestClient();
		symbol = tCurrency+bCurrency;
	}

	// now we need to create the public methods that we need using the api (client)

	
}