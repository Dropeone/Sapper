package Caper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainWindow extends JFrame {

    private JLabel label;

    public MainWindow() {

        //Создаем фрейм (окно).
        setTitle("Сапер (игра)");
        //Просим программу закрыться при закрытии фрейма.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Закрытие программы.
        setResizable(false); //Возможность масштабировать.


        //Создаём лейбл и помещаем его во фрейм.
        label = new JLabel("<html>Обычно двухмерное прямоугольное игровое поле поделено на клетки или другие части, некоторые из которых содержат скрытые мины." + "<br> Игрок открывает клетки, стараясь не попасть на мину. <br> Если игрок откроет клетку (или другую область) с миной, игра заканчивается. <br> Если же мины нет, то в клетке появляется число, обозначающее количество мин в соседних клетках.<br> Рассчитав при помощи таких чисел расположение мин, игрок может пометить соответствующие клетки специальной меткой, чтобы случайно не открыть их.</html>");

        JButton b2 = new JButton("Средний Уровень."); //Создаем обьект Кнопки.
        b2.setLocation(160, 200); //Задаем располажение кнопки.
        b2.setSize(150, 50); //Задаем размер кнопки(ширина-высота).
        label.add(b2); //Добавляем кнопку в JPanel panel.

        JButton b3 = new JButton("Сложный уровень."); //Создаем обьект Кнопки.
        b3.setLocation(311, 200); //Задаем располажение кнопки.
        b3.setSize(150, 50); //Задаем размер кнопки(ширина-высота).
        label.add(b3); //Добавляем кнопку в JPanel panel.

        add(label, BorderLayout.CENTER); // Лейбел центрируем.

        setPreferredSize(new Dimension(500, 300)); // Размеры окна.

        //Создадим кнопку  и поместим ее во фрейм.
        JButton btnIncrease = new JButton("Лёгкий уровень."); // Создаём объект Кнопки.
        //JButton btnIncrease2 = new JButton("Сложный Уровень.");
        btnIncrease.setLocation(10, 200); //Задаем располажение кнопки.
        btnIncrease.setSize(150, 50); //Задаем размер кнопки(ширина-высота).
        label.add(btnIncrease); //Добавляем кнопку в JPanel panel.

        //Добавим к кнопке слушатель события
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Вызываем третье окно.
                StudentMinesweeper3 frame3 = new StudentMinesweeper3();
            }
        });

        //Добавим к кнопке слушатель события
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Вызываем второе окно.
                StudentMinesweeper2 frame2 = new StudentMinesweeper2();
            }
        });

        //add(btnIncrease, SOUTH); //Кнопка на панели снизу.
        //add(btnIncrease2, NORTH);  //Кнопка на панели сверху.

        setLocationRelativeTo(null);
        //Добавим к кнопке слушатель события
        btnIncrease.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Вызываем второе окно.
                StudentMinesweeper frame = new StudentMinesweeper();
            }
        });
        //Выровниваем размер фрейма под контент.
        pack();
    }
    public static void main(String[] args) {
        MainWindow app = new MainWindow();
        app.setVisible(true);
    }
}