#ATM
###A java text based financial program with acounts and ATM functionality

####nouns
* Acount ✓
* Acount Type ✓
* Account number ✓
* balance ✓
* Acount holders name ✓
* intrest rate
	* how am I going to represent that in the correct format?
* status ✓
* transactionLog ✓
* user ✓


####Verbs
* withdraw() or debt()
* deposit() or credit()
* transfers()
* changeStatus()
* changeInterest()
* changeName()
* overDraft()
* OFAC()
* logTransaction()
* DisplayAccount()
* createAccountNum()
	* remember to look into how many numbers are considered unique for an account number in finance
* format$
* format%
 	



###OFAC
> The Office of Foreign Assets Control (OFAC) of the US Department of the Treasury administers and enforces economic and trade sanctions based on US foreign policy and national security goals against targeted foreign countries and regimes, terrorists, international narcotics traffickers, those engaged in activities related to the proliferation of weapons of mass destruction, and other threats to the national security, foreign policy or economy of the United States. OFAC acts under Presidential national emergency powers, as well as authority granted by specific legislation, to impose controls on transactions and freeze assets under US jurisdiction. Many of the sanctions are based on United Nations and other international mandates, are multilateral in scope, and involve close cooperation with allied governments. 

 
##Constraints
* account type and account number must be set durring account creation and not changed. (this does not mean the value cannot be changed
* balance inquirys are allowed at anytime even if OFAC is `true`
* credit and debt should notify user 
* Accounts can transfer funds if account is owned by the same person, with over draft protection. 
* overdraft protection is a feature that can be turned on and off and assigned to different accounts
* closed accounts are closed permanently
* I will need to format so that double always returns two decimal places. 