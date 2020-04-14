package com.nexon.signuppractice_event

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun setupEvents() {
            idEdt.addTextChangedListener(object : TextWatcher {
                override fun afterTextChanged(s: Editable?) {
                    val inputVal = s.toString()
                    if (inputVal.length == 0 ) {
                        idStatusLabel.text = "최소 여섯글자 이상으로 해주세요."
                    } else if (inputVal.length < 6) {
                        idStatusLabel.text = "길이가 너무 짧습니다."
                    } else {
                        idStatusLabel.text = "사용 가능한 ID입니다."
                    }
                }

                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

                }

            })
    }

    override fun setValues() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
}
