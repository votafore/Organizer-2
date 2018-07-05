package com.votafore.organizer.system.appnavigation

import com.votafore.organizer.R
import com.votafore.organizer.ui.pages.PageBase
import com.votafore.organizer.ui.pages.PageMain
import javax.inject.Inject


class PageRouter @Inject constructor(private val activityKeeper: ActivityKeeper,
                                    private val stateKeeper: PageStateKeeper ): Router {

    companion object {
        const val PAGE_MAIN = 10
    }

    private val pageMain = PageMain()

    /***************** Router *****************/

    override fun goToPage(newPage: Int) {

        if (stateKeeper.page == newPage)
            return

        when(newPage){
            PAGE_MAIN -> {
                changePage(pageMain)
            }
        }

        stateKeeper.page = newPage
    }


    /***************** utils *****************/

    private val containerID = R.id.main_container

    private fun changePage(fragmentPage: PageBase, backStack: String? = null){

        val transaction = activityKeeper.fragmentManager?.beginTransaction()!!
        transaction.replace(containerID, fragmentPage)

        if (backStack != null)
            transaction.addToBackStack(backStack)

        transaction.commit()
    }
}