/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author CaoKD
 */
public class Time {
    private final Timer mTimer = new Timer();
    
    Calendar calendar = Calendar.getInstance();
    
    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            System.out.println(calendar.getTime() + " has gone");
            
            int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
            if (currentDay == 10) {
                int currentMonth = calendar.get(Calendar.MONTH) + 1;
                System.out.println("=========> THÔNG BÁO LƯƠNG CHO NHÂN VIÊN");
                
                Salary salaryJanuary = new Salary(currentMonth);

                Employee employeeFirst = new Employee("Khuất Đăng Cao", 10000000);
                Employee employeeSecond = new Employee("Phạm Công Hoàn", 50000000);
                Employee employeeThird = new Employee("Nguyễn Văn Quang", 10000000);
                Employee employeeFourth = new Employee("Nguyễn Ngọc Đinh", 250000000);

                salaryJanuary.registerObserver(employeeFirst);
                salaryJanuary.registerObserver(employeeSecond);
                salaryJanuary.registerObserver(employeeThird);
                salaryJanuary.registerObserver(employeeFourth);

                salaryJanuary.notifyObserver();
                
                System.out.println("====================================");
            }
            
            calendar.add(Calendar.DATE, 1);
        }
    };
    
    void start() {
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        mTimer.scheduleAtFixedRate(timerTask, 1000, 1000);
    }
}
