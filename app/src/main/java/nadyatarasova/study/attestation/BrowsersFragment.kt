package nadyatarasova.study.attestation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class BrowsersFragment : Fragment() {
lateinit var googleButton: Button
    lateinit var yandexButton: Button
    lateinit var mailButton: Button
    lateinit var ramblerButton: Button
    lateinit var yahooButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_browsers, container, false)

        googleButton= view.findViewById(R.id.googleButton)
        yandexButton= view.findViewById(R.id.yandexButton)
        mailButton= view.findViewById(R.id.mailButton)
        ramblerButton= view.findViewById(R.id.ramblerButton)
        yahooButton= view.findViewById(R.id.yahooButton)

        yahooButton.setOnClickListener{
            val link = Uri.parse("http//yahoo.com/")
            val intent= Intent(Intent.ACTION_VIEW,link)
            context?.startActivity(intent)}

        ramblerButton.setOnClickListener{
            val link = Uri.parse("http//rambler.ru/")
            val intent= Intent(Intent.ACTION_VIEW,link)
            context?.startActivity(intent)}

        mailButton.setOnClickListener{
            val link = Uri.parse("http//mail.ru/")
            val intent= Intent(Intent.ACTION_VIEW,link)
            context?.startActivity(intent)}

        yandexButton.setOnClickListener{
            val link = Uri.parse("http//yandex.ru/")
            val intent= Intent(Intent.ACTION_VIEW,link)
            context?.startActivity(intent)}

        googleButton.setOnClickListener{
            val link = Uri.parse("http//google.com/")
            val intent= Intent(Intent.ACTION_VIEW,link)
            context?.startActivity(intent)}






        return view
    }
}
