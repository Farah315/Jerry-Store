package com.fara7.tom_and_jerry

import android.view.View
import android.widget.ScrollView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


fun View.statusBarPadding() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.statusBars())
        v.setPadding(v.paddingLeft, systemBars.top, v.paddingRight, v.paddingBottom)
        insets
    }
}

fun View.systemBarsPadding() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(
            v.paddingLeft + systemBars.left,
            v.paddingTop + systemBars.top,
            v.paddingRight + systemBars.right,
            v.paddingBottom + systemBars.bottom
        )
        insets
    }
}

fun View.navBarMargin() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        val systemBars = insets.getInsets(WindowInsetsCompat.Type.navigationBars())
        val layoutParams = v.layoutParams as? android.view.ViewGroup.MarginLayoutParams
        layoutParams?.bottomMargin = systemBars.bottom
        v.layoutParams = layoutParams
        insets
    }
}

fun ScrollView.navBarPaddingForScroll() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        val navBars = insets.getInsets(WindowInsetsCompat.Type.navigationBars())
        v.setPadding(v.paddingLeft, v.paddingTop, v.paddingRight, navBars.bottom)
        insets
    }
}

fun View.statusBarPaddingForContent() {
    ViewCompat.setOnApplyWindowInsetsListener(this) { v, insets ->
        val statusBars = insets.getInsets(WindowInsetsCompat.Type.statusBars())
        v.setPadding(v.paddingLeft, statusBars.top, v.paddingRight, v.paddingBottom)
        insets
    }
}