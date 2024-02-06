package com.capgemini.taskmanager

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.capgemini.taskmanager.utils.setupDialog

class MainActivity : AppCompatActivity() {

    private val mainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(LayoutInflater)
    }
    private val addTaskDialog:Dialog by lazy {
        Dialog(this).apply {
            setupDialog(R.layout.add_task_dialog)
        }
    }

    private val updateTaskDialog:Dialog by lazy {
 Dialog(this).apply {
     setupDialog(R.layout.update_task_dialog)
 }
    }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(mainBinding.root)


            val addCloseBtn=addTaskDialog.findViewById<ImageView>(R.id.deleteImg)
            val updateBtn=updateTaskDialog.findViewById<ImageView>(R.id.deleteImg)

            addCloseBtn.setOnClickListener{addTaskDialog.dismiss()}
            updateBtn.setOnClickListener{updateTaskDialog.dismiss()}

           mainBinding.add
        }
    }
