package com.example.newsappmvvm.ui.contacts

import android.accounts.Account
import android.accounts.AccountManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsappmvvm.R

class ContactsActivity : AppCompatActivity() {

    val AUTHORITY = "com.example.android.datasync.provider"
    // An account type, in the form of a domain name
    val ACCOUNT_TYPE = "example.com"
    // The account name
    val ACCOUNT = "placeholderaccount"

    private lateinit var mAccount: Account



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)

        mAccount = createSyncAccount()

    }

    private fun createSyncAccount(): Account {
        val accountManager = getSystemService(Context.ACCOUNT_SERVICE) as AccountManager
        return Account(ACCOUNT, ACCOUNT_TYPE).also { newAccount ->
            /*
             * Add the account and account type, no password or user data
             * If successful, return the Account object, otherwise report an error.
             */
            if (accountManager.addAccountExplicitly(newAccount, null, null)) {
                /*
                 * If you don't set android:syncable="true" in
                 * in your <provider> element in the manifest,
                 * then call context.setIsSyncable(account, AUTHORITY, 1)
                 * here.
                 */
            } else {
                /*
                 * The account exists or some other error occurred. Log this, report it,
                 * or handle it internally.
                 */
            }
        }
    }

}