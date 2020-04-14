package com.nexon.signuppractice_event

import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

// 프로젝트에서 공통으로 사용할 변수, 함수들을 모아두는 클래스
// 액티비티들을 그리기 위해 AppCompat를 상속받음
abstract class BaseActivity : AppCompatActivity() {
    val mContext = this

    abstract fun setupEvents()

    abstract fun setValues()
}