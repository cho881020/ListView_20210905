package com.neppplus.listview_20210905.adapters

import android.content.Context
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.neppplus.listview_20210905.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>(mContext, resId, mList) {


//    한 줄xml + StudentData클래스의 정보 결합 -> 리스트뷰의 각 자리에 뿌려주자.
//    xml로 그려둔 한줄 모양을 => kt안에서 활용할 수 있어야함.
//    활용을 도와주는 도구도 필요하다.

    val mInflater = LayoutInflater.from(mContext)


}