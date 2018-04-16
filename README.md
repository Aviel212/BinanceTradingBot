# BinanceTradingBot
This bot will work according to a trading algorithm we developed in order to trade automatically in the Binance trading platform.

The main idea is:
-the bot starts after buying an asset (one that is most likely to go up)
-saving all the required trade's details (for the calculations)
-while():
	-x=trade.precentageIO() //calculated by comparing the current value and the value bought in
	-if trade.inProfit()==true (x = profit in precentages) :
		-if x>xMax :
				xMax=x
				start while() again
		-else :
			-if x>xMax*(1-precentageWillingToLose) :
				start while again
			-else :
				trade.sell()
				break the loop
	-else trade.inProfit()==false (x=profit in precentages) :
		-if x>AvlLoss :
			trade.sell()
			break the loop
		-else :
			start while again
			
As you can understand, 
1. you set to the bot the asset you want to trade in (LTCBTC - example for LTC vs BTC)
2. if it goes down, the bot will allow a loss of 'AvlLoss'
3. if it goes up, the bot will keep checking until it will go 'precentageWillingToLose' down from the max.

that way we basically do a limit-order from both sides while the maximum border is adjusting.

It is an expermintal algorithm and the responsibillity for using it is on the user itself.