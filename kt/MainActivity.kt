<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:padding="16dp"
    android:background="#FFFFFF">


    <LinearLayout
        android:id="@+id/topBar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="8dp"
        android:layout_alignParentTop="true"
        android:layout_marginTop="12dp"
        android:layout_marginBottom="16dp">


        <TextView
            android:id="@+id/scoreText"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:text="Score: 0"
            android:textSize="18sp"
            android:textStyle="bold"
            android:textColor="#212121" />


        <TextView
            android:id="@+id/roundText"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Round: 1"
            android:textSize="18sp"
            android:textStyle="bold"
            android:textColor="#212121" />
    </LinearLayout>


    <LinearLayout
        android:id="@+id/gameArea"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:gravity="center"
        android:layout_centerInParent="true"
        android:layout_below="@id/topBar">


        <ImageView
            android:id="@+id/imageView"
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:layout_marginBottom="20dp"
            android:background="@android:color/darker_gray"
            android:scaleType="centerInside"
            android:padding="4dp" />


        <EditText
            android:id="@+id/guessInput"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Type your guess here"
            android:textSize="16sp"
            android:padding="10dp"
            android:layout_marginBottom="14dp"
            android:background="@android:drawable/edit_text"
            android:inputType="text" />


        <ImageView
            android:id="@+id/feedbackView"
            android:layout_width="120dp"
            android:layout_height="120dp"
            android:layout_marginBottom="16dp"
            android:adjustViewBounds="true"
            android:scaleType="fitCenter" />


        <Button
            android:id="@+id/submitBtn"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Submit Guess"
            android:textSize="16sp"
            android:layout_marginBottom="10dp" />

       
        <Button
            android:id="@+id/backBtn"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Back to Menu"
            android:textSize="16sp" />
    </LinearLayout>

</RelativeLayout>
