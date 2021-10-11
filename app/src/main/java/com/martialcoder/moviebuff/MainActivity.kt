package com.martialcoder.moviebuff

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.drawerlayout.widget.DrawerLayout
import butterknife.BindView
import butterknife.ButterKnife
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    companion object {
        const val SELECTED_MOVIE_KEY = "MovieSelected";
        const val SELECTED_NAVIGATION_ITEM_KEY = "SelectedNavigationItem";
    }

    @BindView(R.id.drawer_layout)
    var drawerLayout: DrawerLayout? = null
    @BindView(R.id.navigation_view)
    var navigationView: NavigationView? = null
    var coordinatorLayout: CoordinatorLayout? = null

    @BindView(R.id.toolbar)
    var toolbar: Toolbar? = null

//    @Nullable
//    @BindView(R.id.movie_detail_container)
//    var movieDetailContainer: ScrollView? = null
//
//    @Nullable
//    @BindView(R.id.fab)
//    var fab: FloatingActionButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    ButterKnife.bind(this)

    }
}