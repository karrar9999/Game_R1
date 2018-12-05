package camp.codelab.game_r

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val res = sharedPreferences.getString("TIP", "")
        FinalReslttextView.setText(res.toString())
        var  result1=0
        var  result2=0

        Resetbutton10.setOnClickListener(){

            result1=0
            result2=0
            FinalReslttextView.text=result1.toString()+"-"+result2.toString()

        }




        p1t1.setOnClickListener(){


            result1+=1


    }
        p2t1.setOnClickListener() {
            result1+=2

        }
        p3t1.setOnClickListener() {
            result1+=3

        }




        p1t2.setOnClickListener(){


            result2+=1


        }
        p2t2.setOnClickListener() {
            result2+=2

        }
        p3t2.setOnClickListener() {
            result2+=3


        }




        Finalbutton.setOnClickListener(){

            if (result1> result2)
            {




            }

            FinalReslttextView.text=" Clevland cavaliers  "+result2.toString()+"-"+result1.toString()+"  Orlando Magic "


        }




        }



    override fun onStop() {
        super.onStop()

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)
        val Resulttext = FinalReslttextView.text.toString()




    }






    }

