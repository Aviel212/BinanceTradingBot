import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.TimeInForce;
import com.binance.api.client.domain.account.AssetBalance;
import com.binance.api.client.domain.account.NewOrder;
import com.binance.api.client.domain.account.NewOrderResponse;
import com.binance.api.client.domain.account.Order;
import com.binance.api.client.domain.account.request.CancelOrderRequest;
import com.binance.api.client.domain.account.request.OrderRequest;
import com.binance.api.client.domain.account.request.OrderStatusRequest;
import com.binance.api.client.domain.market.OrderBook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TraderClient {
	private static Logger logger = LoggerFactory.getLogger(TraderClient.class);

	private BinanceApiRestClient client; \\used to communicate with binance-api
	private String baseCurrency;
	private String tradeCurrency;
	private String symbol;

	TraderClient(String bCurrency, String tCurrency, String key, String secret) {
		this.baseCurrency=bCurrency;
		this.tradeCurrency=tCurrency;
		BinanceApiClientFactory factory=BinanceApiClientFactory.newInstance(key,secret);
		client = factory.newRestClient();
		symbol=tCurrency+bCurrency;
	}

	//now we need to create the public methods that we need using the api (client)

	
}