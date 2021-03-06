# Project 0: Console Banking App
Superdank Bank is a console banking application that allows users to create accounts and make
deposits/withdrawals to their accounts.

# Github
This project can be found on [https://github.com/sinhac/SuperdankBank](
https://github.com/sinhac/SuperdankBank).

# Tech Stack
 + Uses __Oracle SQL__ to create Account, Transaction, and User entities in the database. 
 + Persists user and bank data to an __AWS RDS__ by using __JDBC__ and the Data Access Object design 
pattern.
 + Uses __Java__ to implement the logic for depositing to and withdrawing from bank accounts.
 + Uses __Apache Maven__ as a build automation tool.

# User Stories
 + create a user account with a unique email and/or username
 + secure my account using a password
 + log in/log out
 + create a bank account associated with each user
 + deposit money
 + withdraw money (no negative balances!)
 + view account balance
