package com.example.texnologiesdiadiktiou;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.texnologiesdiadiktiou.InputClasses.Company;
import com.example.texnologiesdiadiktiou.InputClasses.Employee;
import com.example.texnologiesdiadiktiou.InputClasses.SpecialtyPerHours;
import com.example.texnologiesdiadiktiou.InputClasses.WorkDay;
import com.example.texnologiesdiadiktiou.InputClasses.WorkHoursPerDay;

public class Page3 extends AppCompatActivity {


    Button buttonNext, buttonPrevious, buttonGenerate;

    //Company currentCompany;

    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.companyInput,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    // currentCompany = mySpinner.getSelectedItem();

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) { }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openPage4();
            };
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        buttonPrevious = (Button) findViewById(R.id.buttonPrevious);
        buttonPrevious.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){
                openPage2();
            };
        }
    }

    //It will change with polymophism later on.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        buttonGenerate = (Button) findViewById(R.id.buttonGenerate);
        buttonGenerate.setOnClickListener(new View.OnClickListener()){
            @Override
            public void onClick(View v){

                int numberOfEmployees,  i, j, k, daysOfTheWeek = 7, totalWorkingHoursPerDay = 24, employeesTempPosition;
                Company currentCompany;
                WorkDay workdays;
                WorkHoursPerDay workingHoursPerDay
                SpecialtyPerHours specialtyPerHours;
                Employee tempEmployee, currentWorkerOnPost;
                private String workSchedule[] = new String[(currentCompany.getNumberOfEmployees()+1), (currentCompany.getNumberOfWorkDays()+1)];

                numberOfEmployees = currentCompany.getEmployeeAmmount();
                workdays = currentCompany.getWorkdays();
                workingHoursPerDay = currentCompany.getWorkingHoursPerDay();
                specialtyPerHours = currentCompany.getSpecialtyPerHours();


                for (i = 0; i < numberOfEmployees){

                    workSchedule[i,0] = currentCompany.getEmployee.getFirstName + " " + currentCompany.getEmployee.getLastName;

                }

                for (i = 0; i < daysOfTheWeek){

                    workSchedule[0,i] = currentCompany.getDayOpen(i).toString();

                    if (workdays == false){

                        for (j = 1; j < numberOfEmployees){

                            workSchedule[j,i] = "CLOSED.";

                        }

                    }

                }




            //for (i = 0; i < numberOfEmployees){


                for (j = 0; j < daysOfTheWeek){

                    if (workdays == true){


                        for (k = 0; k < totalWorkingHoursPerDay){


                            if (workingHoursPerDay == true){

                                tempEmployee = currentCompany.getEmployee(0);
                                currentWorkerOnPost = currentCompany.getEmployee(0);
                                employeesTempPosition = 0;

                                for (i = 1; i < numberOfEmployees){


                                    tempEmployee = currentCompany.getEmployee;

                                    if (tempEmployee.getGravityOfChoise.toInt() < currentWorkerOnPost.getGravityOfChoise.toInt() )

                                        currentWorkerOnPost = tempEmployee;
                                        employeesTempPosition = i;


                                }

                                workSchedule[employeesTempPosition, j] = currentCompany.getWorkingHour().toString();


                            }


                        }


                    }

                }





            //}

            };
        }
    }



    public void openPage4(){
        Intent intent = new intent(this , Page4.class);
        startActivity(intent);

    }

    public void openPage2(){
        Intent intent = new intent(this , Page2.class);
        startActivity(intent);

    }

}