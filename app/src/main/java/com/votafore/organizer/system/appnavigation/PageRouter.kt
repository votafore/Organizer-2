package com.votafore.organizer.system.appnavigation

import com.votafore.organizer.R
import com.votafore.organizer.ui.pages.PageBase
import com.votafore.organizer.ui.pages.PageList
import com.votafore.organizer.ui.pages.PageMain
import com.votafore.organizer.ui.pages.PageSettings
import javax.inject.Inject


class PageRouter @Inject constructor(private val activityKeeper: ActivityKeeper): Router {

    companion object {
        const val PAGE_MAIN = 10
        const val PAGE_LIST = 20
        const val PAGE_SETTINGS = 30
    }

    private var currentPage = 0

    private val pageMain = PageMain()
    private val pageList = PageList()
    private val pageSettings = PageSettings()

    /***************** Router *****************/

    override fun goToPage(newPage: Int) {

        if (currentPage == newPage)
            return

        when(newPage){
            PAGE_MAIN -> {
                changePage(pageMain)
            }
            PAGE_LIST -> {
                changePage(pageList)
            }
            PAGE_SETTINGS -> {
                changePage(pageSettings)
            }
        }

        currentPage = newPage
    }


    /***************** utils *****************/

    private fun changePage(fragmentPage: PageBase, backStack: String? = null){

        val transaction = activityKeeper.fragmentManager?.beginTransaction()!!
        transaction.replace(R.id.main_container, fragmentPage)

        if (backStack != null)
            transaction.addToBackStack(backStack)

        transaction.commit()
    }
}