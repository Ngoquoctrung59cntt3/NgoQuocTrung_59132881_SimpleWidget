package vn.edu.ntu.ngoquoctrung_59132881_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtTen,txtNS,txtGT,txtST,txtSTK;
    EditText edtTen, edtNS, edtSTK;
    RadioGroup radioGroup;
    CheckBox checkBoxXP, checkBoxNN, checkBoxCF, checkBoxON, checkBoxVB;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }

    private void addViews() {
        edtTen = findViewById(R.id.edtTen);
        edtNS = findViewById(R.id.edtNS);
        edtSTK = findViewById(R.id.edtSTK);
        radioGroup = findViewById(R.id.radioGroup);
        checkBoxXP = findViewById(R.id.checkBoxXP);
        checkBoxNN = findViewById(R.id.checkBoxNN);
        checkBoxCF = findViewById(R.id.checkBoxCF);
        checkBoxON = findViewById(R.id.checkBoxON);
        checkBoxVB = findViewById(R.id.checkBoxVB);
        button = findViewById(R.id.button);
    }

    private void addEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }

    private void show() {
        String mesage = edtTen.getText() + "\n" + "Ngày sinh: " + edtNS.getText() + "\n";
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radioButton:
                mesage = mesage + "Giới tính: Nam" + "\n" + "Sở thích: ";
                break;
            case R.id.radioButton2:
                mesage = mesage + "Giới tính: Nữ" + "\n" + "Sở thích: ";
                break;
        }
        if (checkBoxXP.isChecked()) {
            mesage = mesage + checkBoxXP.getText() + "; ";
        }
        if (checkBoxNN.isChecked()) {
            mesage = mesage + checkBoxNN.getText() + "; ";
        }
        if (checkBoxCF.isChecked()) {
            mesage = mesage + checkBoxCF.getText() + "; ";
        }
        if (checkBoxON.isChecked()) {
            mesage = mesage + checkBoxON.getText() + "; ";
        }
        if (checkBoxVB.isChecked()) {
            mesage = mesage + checkBoxVB.getText() + "; ";
        }
        mesage = mesage + edtSTK.getText();
        Toast toast = Toast.makeText(getApplicationContext(), mesage, Toast.LENGTH_LONG);
        View view = toast.getView();
        TextView view1 = (TextView) view.findViewById(android.R.id.message);
        view1.setTextColor(Color.WHITE);
        view.setBackgroundResource(R.color.colorMessage);
        toast.show();
    }
}
