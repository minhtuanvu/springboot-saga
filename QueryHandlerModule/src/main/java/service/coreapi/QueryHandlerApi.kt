package service.coreapi

import org.axonframework.commandhandling.TargetAggregateIdentifier

class QueryHandlerSaveOrderCommand(@TargetAggregateIdentifier val orderId: String,
                                   val user: String, val article: String, val quantity: Int, val price: String)

class QueryHandlerOrderSavedEvent(val orderId: String, val user: String,
                                  val article: String, val quantity: Int, val price: String)

class QueryHandlerSaveStockCommand(@TargetAggregateIdentifier val stockId: String, val articleId: String,
                                   val article: String, val quantity: Int, val availability: Int)
class QueryHandlerStockSavedEvent(val stockId: String, val articleId: String, val article: String, val quantity: Int, val availability: Int)

class DeleteOrderCommand(@TargetAggregateIdentifier val orderId: String, val user: String,
                         val article: String, val quantity: Int, val price: String)

class OrderDeletedEvent(val orderId: String, val user: String,
                        val article: String, val quantity: Int, val price: String)