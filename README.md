# Android-PullToRefresh-Extention
## What to do ?
This project aims to make [Android-PullToRefresh](https://github.com/chrisbanes/Android-PullToRefresh "click to study this library") library support custom animation by GIF file.
## What does it looks like ?
As we can see from [Android-PullToRefresh](https://github.com/chrisbanes/Android-PullToRefresh "click to study this library"),
the library provides two animations for us, one is FLIP, another is ROTATE, just like below:
<br>![](https://github.com/chrisbanes/Android-PullToRefresh/raw/master/header_graphic.png)
<br>`BUT` now we want to replace the FLIP or ROTATE PNG file with our GIF file. just like below:
<br>![](https://github.com/LiuJQ/Android-PullToRefresh-Extention/blob/master/loading_animation.gif)
## How to realize ?
Thanks to this [GifView](https://github.com/RoiSoleil/GifView, "click to study this library") library, we don't need to do too much thing, Oh yeah ^_^.
<br>Just like [FlipLoadingLayout](https://github.com/LiuJQ/Android-PullToRefresh-Extention/blob/master/src/com/handmark/pulltorefresh/library/internal/FlipLoadingLayout.java)
and [RotateLoadingLayout](https://github.com/LiuJQ/Android-PullToRefresh-Extention/blob/master/src/com/handmark/pulltorefresh/library/internal/RotateLoadingLayout.java), 
I create a [GifLoadingLayout](https://github.com/LiuJQ/Android-PullToRefresh-Extention/blob/master/src/com/handmark/pulltorefresh/library/internal/GifLoadingLayout.java) 
and place the [GifView](https://github.com/RoiSoleil/GifView, "click to study this library") in it, just like what you can see in the project.
## How to use ?
Previously, we use Android-PullToRefresh library like this:
```Xml
<com.handmark.pulltorefresh.library.PullToRefreshListView
            xmlns:ptr="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            ptr:ptrAnimationStyle="flip"
            ptr:ptrDrawable="@drawable/ptr_drawable"
            ptr:ptrHeaderBackground="@color/yx_background_eae"
            ptr:ptrHeaderSubTextColor="@color/yx_textcolor_7d7"
            ptr:ptrHeaderTextColor="@color/yx_textcolor_7d7"
            ptr:ptrMode="both" />
```
Now, we just need to change something like below:
```Xml
<com.handmark.pulltorefresh.library.extras.GifPullToRefreshListView
            xmlns:ptr="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            ptr:ptrAnimationStyle="gif"
            ptr:ptrDrawable="@drawable/pull_to_refresh_git_progress"
            ptr:ptrHeaderBackground="@color/yx_background_eae"
            ptr:ptrHeaderTextAppearance="?android:attr/textAppearanceSmall"
            ptr:ptrHeaderSubTextColor="@color/yx_textcolor_7d7"
            ptr:ptrHeaderTextColor="@color/yx_textcolor_7d7"
            ptr:ptrMode="both"
            ptr:ptrGifResource="@raw/loading_animation"
            ptr:ptrGifPaused="false" />
```
## Extras
Commits and Feedbacks are warmly welcome !
<br>Email: liujianqiao39870@gmail.com
