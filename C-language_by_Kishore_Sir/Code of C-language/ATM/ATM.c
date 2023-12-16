// Build a simplified ATM simulation where users can check their balance, withdraw money, and deposit funds. Use arrays to manage user accounts and transactions.



// Explanation:

// An ATM (Automated Teller Machine) simulation allows users to perform banking transactions such as checking their balance, withdrawing money, and depositing funds. In this project, we'll create a simplified version of an ATM simulation using arrays to manage user accounts and transactions.



// Input/Output:-

// ==== ATM Simulation ====

// 1. Login

// 2. Exit

// Enter your choice: 1



// Enter account number: 1234

// Enter PIN: 5678



// Invalid account number or PIN



// ==== ATM Simulation ====

// 1. Login

// 2. Exit

// Enter your choice: 1



// Enter account number: 9876

// Enter PIN: 5432



// Welcome, User 9876

// 1. Check Balance

// 2. Withdraw

// 3. Deposit

// 4. Logout

// Enter your choice: 1

// Your balance: 500.00



// Welcome, User 9876

// 1. Check Balance

// 2. Withdraw

// 3. Deposit

// 4. Logout

// Enter your choice: 2

// Enter withdrawal amount: 300

// Withdrawal successful



// Welcome, User 9876

// 1. Check Balance

// 2. Withdraw

// 3. Deposit

// 4. Logout

// Enter your choice: 1

// Your balance: 200.00



// Welcome, User 9876

// 1. Check Balance

// 2. Withdraw

// 3. Deposit

// 4. Logout

// Enter your choice: 3

// Enter deposit amount: 100

// Deposit successful



// Welcome, User 9876

// 1. Check Balance

// 2. Withdraw

// 3. Deposit

// 4. Logout

// Enter your choice: 1

// Your balance: 300.00



// Welcome, User 9876

// 1. Check Balance

// 2. Withdraw

// 3. Deposit

// 4. Logout

// Enter your choice: 4



// ==== ATM Simulation ====

// 1. Login

// 2. Exit

// Enter your choice: 2

// Exiting ATM simulation



// Explanation of Code:

// We define arrays to store user data and transactions, including account numbers, PINs, balances, and transaction details.
// The main() function contains a loop that displays a menu with options to log in or exit.
// The user is prompted for a choice, and the program uses a switch-case statement to handle the chosen option.
// Option 1 allows the user to log in by entering their account number and PIN.
// If the account number and PIN match, the user is logged in and presented with a menu to check balance, withdraw, deposit, or logout.
// Option 1 displays the user's balance from the balances array.
// Option 2 prompts the user to enter a withdrawal amount, deducts the amount from their balance if sufficient, and records the transaction.
// Option 3 prompts the user to enter a deposit amount, adds the amount to their balance, and records the transaction.
// Option 4 logs out the user.
// The program exits when the user chooses to exit.






// Arrays
// –
