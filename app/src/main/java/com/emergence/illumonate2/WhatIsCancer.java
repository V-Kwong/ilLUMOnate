package com.emergence.illumonate2;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by Vincent on 20/02/17.
 */

public class WhatIsCancer extends Activity{

    private final String htmlText = "<h1>What is Cancer?</h1>" + "<h2>Myths</h2><ul><li>Is cancer a death sentence?<ul>" + "<li>No it isn't, five year survival rates for cancer such as breast, prostate and thyroid cancer is over 90  percent. <ul>"
            + "<li>All cancer is around 66% <ul> <li>These stats are general due to large number of people and facors like the behavior of the cancer, how much cancer, overall health of patient etc.</li>" + "<li>These stats are reported by the annual report to the nation on the status of cancer</li> " +
            "    </ul> " +
            "    </li> " +
            "    </ul> " +
            "    </li>" + "</ul> " +
            "    </li> " +
            "    <li>Will sugar make it worse " +
            "            <ul> " +
            "    <li>No, no studies shown sugar affects the decrease or decay of cancer. Reason why people think this is because cancer consume of sugar than normal cells.</li> " +
            "    <li>Increased sugar diet will cause other things like obesity which can increase the risk of other types of cancer</li> " +
            "    </ul> " +
            "    </li> " +
            "    <li>Is Cancer Contagious? " +
            "    <ul>" + "<li>No, no evidence has shown that cancer can be spread from one person to another via kissing, sex, touching, sharing food/beverage or breathing the same air. " +
            "    <ul> " +
            "    <li>Reason is why when cancer cell enters a healthy person, the immune system would immediately destroy the foreign cells.</li> " +
            "    </ul> " +
            "    </li> " +
            "    </ul> " +
            "    </li> " +
            "    <li>Physical activities and Cancer? " +
            "    <ul>" + "<li>Physical activities may be beneficial in improving quality of life and reducing fatigue and assist with energy balance. A study found that a woman (diagnosed with breast cancer) who exercised moderately had improved survival rates compared with sedentary women.</li> " +
            "    <li>Another study found home based activity had beneficial effect on the fitness and psychological well-being of previously sedentary women. " +
            "    <ul> " +
            "    <li>More research is needed and it’s too early to draw conclusions</li> " +
            "    </ul>" +"</li> " +
            "    </ul> " +
            "    </li> " +
            "    </ul> " + "<h2>Symptoms</h2> " +
            "    <ul> " +
            "    <li>Loss of appetite and weight loss</li> " +
            "    <li>Dehydration</li> " +
            "    <li>Fatigue</li> " +
            "    <li>Nausea and Vomiting</li> " +
            "    <li>Constipation</li> " +
            "    <li>Difficulty breathing</li> " +
            "    </ul> " +
            " " +
            "    <h2>Treatments</h2> " +
            "    <ul> " +
            "    <li>Surgery " +
            "            <ul> " +
            "    <li>Usually uses small thin knives to cut out the cancer cells " +
            "            <ul> " +
            "    <li>Other types of surgery include: " +
            "    <ul> " +
            "    <li>Cryosurgery " +
            "            <ul> <li>Uses extreme cold with liquid nitrogen or argon gas to destroy abnormal tissue</li> </ul> " +
            "    </li> " +
            "    <li>Lasers " +
            "            <ul><li>Lasers are used to cut through tissue for precise surgeries → shrink or destroy cancer growth</li></ul> " +
            "    </li> " +
            "    <li>Hyperthermia " +
            "            <ul><li>High heat kills cancer tell and make them more sensitive to radiation</li></ul> " +
            "    </li> " +
            "    <li>Photodynamic therapy " +
            "    <ul><li>Uses drugs that react to a certain type of light and kills nearby cancer cells</li></ul> " +
            "    </li> " +
            "    </ul> " +
            "    </li> " +
            "    </ul> " +
            "    </li> " +
            "    </ul> " +
            "    </li> " +
            "    <li>Radiation Therapy " +
            "    <ul> " +
            "    <li>External Beam radiation Therapy " +
            "    <ul><li>Sends radiation to the part of your body with cancer</li></ul> " +
            "    </li> " +
            "    <li>Internal radiation therapy " +
            "            <ul><li>Puts a source of radiation in your body and it seeks out and kills cancer cells</li></ul> " +
            "    </li> " +
            "    </ul> " +
            "    </li> " +
            "    <li>Chemotherapy " +
            "            <ul><li>Stops or slows growth of cancer cell</li></ul> " +
            "    </li> " +
            "    <li>Immunotherapy " +
            "            <ul><li>Helps your immune system fight cancer</li></ul> " +
            "    </li> " +
            "    </ul> " +
            "    </body>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whatiscancer);

        TextView htmlTextView = (TextView)findViewById(R.id.textView);
        htmlTextView.setText(Html.fromHtml(htmlText));

    }

}
