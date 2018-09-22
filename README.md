#Project Description 
The domain that we are going to model is the database system for a retail market (i.e. the information of each product sold in the Shoppers). 

The aspects of the retail market that we will be modelling will be the information relevant to the product in the market (like Shoppers). This information includes things like that a given product has a specific product number, date in-store, purchasing price, selling price. There will be different categories of products. 


#Database Specifications 
There will be three different classes of users of the system: the managers, the cashiers, and the customers. The customers will have access to the basic information associate with barcode(UPC), including current price, sale percentage, inventory, producers, and units of product, etc. The cashiers will have access to advance information such as modifying the number of items left by scanning the barcode in the cash register other than the access given to customers, or the expired date. Each cashiers will have their own employee # and name recorded in the system, and the employee # will be used to record each transaction made by this cashier.
The managers will have access to adding new cashiers, adding new managers, marking on Sale tag on products, change the price of products, checking purchasing price of each product, and get marketing reports by weeks.


#Application Platforms
This project will be done using Java and JDBC and mySQL. 
