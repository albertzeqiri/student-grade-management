# NotoStudentin - Student Grade Management

This is a simple Java application that allows users to manage student grades. The program allows the user to input student names and their grades, display them, and modify a student's grade if needed. It can be used to track and manage grades for a list of students.

## Features

- **Input Student Names**: Users can input the names of the students.
- **Input Student Grades**: Users can input grades for each student.
- **Display Student Names and Grades**: Displays the list of all student names and their corresponding grades.
- **Change Student Grade**: Allows the user to modify the grade of a specific student by providing their name and the new grade.
  
## Technologies Used

- **Java**: The program is written in Java.
- **Scanner Class**: For accepting user input.

## How It Works

1. The program asks for the number of students.
2. It then asks for the names of each student.
3. The program proceeds by asking for the grades of each student.
4. The names and grades are then displayed.
5. After displaying the grades, the program allows the user to modify the grade of any student by entering their name and new grade.
6. Finally, it displays the updated list of student grades.

## Example Output

```text
Shkruani numrin e studenteve: 3
Shkruani emrin e studentit 1: Alban
Shkruani emrin e studentit 2: Maria
Shkruani emrin e studentit 3: Ilir
Shkruani noten e studentit Alban: 8
Shkruani noten e studentit Maria: 9
Shkruani noten e studentit Ilir: 7
Emrat e studenteve:
Alban
Maria
Ilir
Notat e studenteve:
Alban: 8
Maria: 9
Ilir: 7
Shkruani emrin e studentit qe deshironi ta ndryshoni: Maria
Shkruani noten e re per studentin Maria: 10
Nota e studentit Maria u ndryshua me sukses.
Notat e studenteve:
Alban: 8
Maria: 10
Ilir: 7
