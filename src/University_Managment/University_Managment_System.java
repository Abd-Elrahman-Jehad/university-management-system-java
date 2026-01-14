
package University_Managment;

import java.util.Scanner;

public class University_Managment_System {

    static Scanner input = new Scanner(System.in);
    public static int departmantRowlength, courseRowlength, insrtuctorRowlength, studentRowlength,
            courseRegesdrRowlength, insrtuctorRegesdrRowlength, isa;
    public static String adminName = "M-A";
    public static String passWord = "123";
    public static String[][] departmentA = new String[100][2];
    public static String[][] courseA = new String[100][4];
    public static String[][] instructorA = new String[100][8];
    public static String[][] studentA = new String[100][9];

    public static String[][] courseAssing = new String[100][9];
    public static String[][] courseRegesdr = new String[100][9];

    public static void main(String[] args) {

        int ch;
        do {
            System.out.println("============ Welcome User ============");
            System.out.println("1-admin");
            System.out.println("2-Instructor");
            System.out.println("3-Student");
            System.out.println("4-Exit");

            ch = input.nextInt();
            switch (ch) {
                case 1:
                    admin();

                    break;
                case 2:
                    instructor();
                    break;
                case 3:
                    student();
                    System.out.println("com " + departmentA[0].length + "\n raw " + departmentA.length);
                    break;
                default:
                    System.out.println("wrong option!!");
            }

        } while (ch != 5);

    }

    public static void admin() {

        System.out.println("======= Welcome Admin =======");

        System.out.print("Enter UserName :");
        String userName = input.next();
        input.nextLine();

        System.out.print("Enter Password :");
        String password = input.next();

        if (userName.equals(adminName) && password.equals(passWord)) {
            int ch1;
            do {
                System.out.println("======= Welcome " + userName + "=======");
                System.out.println("1-Add");
                System.out.println("2-assing");
                System.out.println("3-Show");
                System.out.println("4-UPdate");
                System.out.println("5-Delete");
                System.out.println("6-Search");
                System.out.println("7-Exit");
                System.out.print("Enter your choice haer: ");

                ch1 = input.nextInt();
                switch (ch1) {
                    case 1:
                        add();
                        break;
                    case 2:
                        assing();
                        break;
                    case 3:
                        show();
                        break;

                    case 4:
                        upDate();
                        break;

                    case 5:
                        delete();
                        break;

                    case 6:
                        search();
                        break;

                    default:
                        System.out.println("Enter form mainu :");
                        break;
                }
            } while (7 != ch1);
        } else {
            System.out.println("^-^ Sory ,the data is incorrent ^-^");

        }

    }

    public static void add() {

        int add;
        do {
            System.out.println("~~~~~~~ Choose the thing yoy want to add it ~~~~~~~");
            System.out.println("1-Add Departments");
            System.out.println("2-Add Course");
            System.out.println("3-Add Instructor");
            System.out.println("4-Add Student");
            System.out.println("5-Exit");
            add = input.nextInt();

            switch (add) {
                case 1:
                    addDepartments();

                    break;
                case 2:
                    addCourse();
                    break;
                case 3:
                    addInstructor();
                    break;
                case 4:
                    addStudent();
                    break;
                default:
                    
                    break;
            }
        } while (add != 5);
    }

    public static void addDepartments() {

        for (int i = 0; i < 1; i++) {

            System.out.print("Enter Department ID :");
            departmentA[departmantRowlength][0] = input.next();
            input.nextLine();
            System.out.print("Enter Department Name :");
            departmentA[departmantRowlength][1] = input.nextLine();
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^   Success Proccess    ^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            ++departmantRowlength;

        }

    }

    public static void showDepartments() {

        int nameCollength = departmentA[0].length;

        System.out.println("Select Departments :");
        for (int i = 0; i < departmantRowlength; i++) {

            System.out.print(i + "- " + departmentA[i][1]);

            System.out.println("");
        }
    }

    public static void addCourse() {

        for (int i = 0; i < 1; i++) {

            System.out.println("Enter Coures ID :");
            courseA[courseRowlength][0] = input.next();
            input.nextLine();

            System.out.println("Enter Coures Name :");
            courseA[courseRowlength][1] = input.nextLine();

            System.out.println("Enter Coures code :");
            courseA[courseRowlength][2] = input.next();

            System.out.println("Enter Coures Number of Hours :");
            courseA[courseRowlength][3] = input.next();
            ++courseRowlength;
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^   Success Proccess    ^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        }

    }

    public static void addInstructor() {

        for (int i = 0; i < 1; i++) {

            System.out.println("Enter Instructor ID :");
            instructorA[insrtuctorRowlength][0] = input.next();
            input.nextLine();

            System.out.println("Enter Instructor Name :");
            instructorA[insrtuctorRowlength][1] = input.next();

            System.out.println("Enter Instructor password :");
            instructorA[insrtuctorRowlength][2] = input.next();
            input.nextLine();

            showDepartments();
            int deparmentRow = input.nextInt();

            instructorA[insrtuctorRowlength][3] = departmentA[deparmentRow][1];

            System.out.println("Enter Instructor Addres   :");
            instructorA[insrtuctorRowlength][4] = input.next();

            System.out.println("Enter Instructor Age   :");
            instructorA[insrtuctorRowlength][5] = input.next();

            System.out.println("Enter Instructor Phone   :");
            instructorA[insrtuctorRowlength][6] = input.next();
            ++insrtuctorRowlength;
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^   Success Proccess    ^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        }

    }

    public static void addStudent() {

        for (int i = 0; i < 1; i++) {
            String nll = "";
            System.out.println("Enter Student ID :");
            studentA[studentRowlength][0] = input.next();
            input.nextLine();

            System.out.println("Enter Student Name :");
            studentA[studentRowlength][1] = input.next();
            input.nextLine();

            System.out.println("Enter Student password :");
            studentA[studentRowlength][2] = input.next();
            input.nextLine();

            showDepartments();
            int deparmentRow = input.nextInt();
            studentA[studentRowlength][3] = departmentA[deparmentRow][1];
            input.nextLine();

            System.out.println("Enter Student Addres :");
            studentA[studentRowlength][4] = input.next();
            input.nextLine();

            System.out.println("Enter Student Age  :");
            studentA[studentRowlength][5] = input.next();
            input.nextLine();

            System.out.println("Enter Student Phone  :");
            studentA[studentRowlength][6] = input.next();
            input.nextLine();

            System.out.println("Avaergae  :");
            studentA[studentRowlength][7] = input.next();

            ++studentRowlength;
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("^   Success Proccess    ^");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        }
    }
    ///////////////////////asing////////////

    public static void assing() {
        System.out.println("~~~~~~~ Assgin Course To INSTRUCTOR ~~~~~~~");
        System.out.println("Enter insrtuctor ID:");
        String id = input.next();
        boolean insrtuctorID = false;
        int m1 = 0;
        int m2 = 0;
        for (int i = 0; i < insrtuctorRowlength; i++) {
            if (id.equals(instructorA[i][0])) {
                insrtuctorID = true;
                m1 = i;
                break;
            }
        }
        if (insrtuctorID) {
            for (int i = 0; i < courseRowlength; i++) {
                System.out.println((i + 1) + "[course ID:" + courseA[i][0] + " | Name:" + courseA[i][1] + " | code:" + courseA[i][2] + " | Hour:" + courseA[i][3] + "]");
            }
        }
        System.out.println("Enter course ID:");
        String c_Id = input.next();
        boolean CourseID = false;
        for (int i = 0; i < courseRowlength; i++) {
            if (c_Id.equals(courseA[i][0])) {
                CourseID = true;
                m2 = i;
                break;
            }
        }
        if (CourseID) {
            boolean alreadyExist = false;
            for (int i = 0; i < insrtuctorRegesdrRowlength; i++) {
                if (id.equals(courseAssing[i][0]) && c_Id.equals(courseAssing[i][1])) {
                    alreadyExist = true;
                    break;
                }
            }
            if (!alreadyExist) {
                courseAssing[insrtuctorRegesdrRowlength][0] = id;
                courseA[insrtuctorRegesdrRowlength][1] = c_Id;
                courseAssing[insrtuctorRegesdrRowlength][2] = instructorA[m1][1];
                courseAssing[insrtuctorRegesdrRowlength][3] = instructorA[m1][2];
                courseAssing[insrtuctorRegesdrRowlength][4] = instructorA[m1][3];
                courseAssing[insrtuctorRegesdrRowlength][5] = instructorA[m1][4];
                courseAssing[insrtuctorRegesdrRowlength][6] = instructorA[m1][5];
                courseAssing[insrtuctorRegesdrRowlength][7] = instructorA[m1][6];
                courseAssing[insrtuctorRegesdrRowlength][8] = instructorA[m2][1];
                courseAssing[insrtuctorRegesdrRowlength][9] = instructorA[m2][2];
                courseAssing[insrtuctorRegesdrRowlength][10] = instructorA[m2][3];

                insrtuctorRegesdrRowlength++;
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^\n^    Success proccess    ^\n^^^^^^^^^^^^^^^^^^^^^^^^^^");

            } else {
                System.out.println("!!!! Sorry, the course is already Assgined !!!!");
            }
        } else {
            System.out.println("^^ Sorry , the Data is incorrect ^^\n    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^    ");
        }
    }

    //////////////////show arrya ///////////
    public static void show() {
        int inpt;
        do {
            System.out.println("-------------- Choose the thing you want to show all to it");
            System.out.println("1-Show All Departmamts ");
            System.out.println("2-Show All Course");
            System.out.println("3-Show All Instructor");
            System.out.println("4-Show All Student");
            System.out.println("5-Exit ");
            inpt = input.nextInt();
            switch (inpt) {
                case 1:
                    showArrya(departmentA);
                    break;

                case 2:
                    showArrya(courseA);

                    break;

                case 3:
                    showArrya(instructorA);
                    break;

                case 4:
                    showArrya(studentA);
                    break;

                default:
                    System.out.println("wrong option!!");
            }
        } while (5 != inpt);

    }

    public static void showArrya(String[][] arry) {

       for (int i = 0; i < arry.length; i++) {
            if (arry[i][0] != null) {
                //1
                //System.out.print(i + "-");
                for (int j = 0; j < departmantRowlength; j++) {
                    if (arry[j][0] != null) {
                        System.out.print(j + "-[Department ID :" + arry[j][0] + " | Department Name :" + arry[j][1] + "]");

                    }
                    System.out.println("");
                }
                for (int j = 0; j < courseRowlength; j++) {
                    if (arry[j][0] != null) {
                        System.out.print(j + "-[Course ID :" + arry[j][0] + " | Name :" + arry[j][1] + " | code :" + arry[j][2] + " | Hore :" + arry[j][3] + "]");

                    }
                }

                for (int j = 0; j < insrtuctorRowlength; j++) {
                    if (arry[j][0] != null) {
                        System.out.print(j + "-[Insrtuctor ID :" + arry[j][0] + " | Insrtuctor Name :" + arry[j][1] + " | password :" + arry[j][2] + " | Departmant :" + arry[j][3] + " | Address :" + arry[j][4] + " | Age :" + arry[j][5] + " | Phone :" + arry[j][6] + "]");
                    }

                }
                for (int j = 0; j < studentRowlength; j++) {
                    if (arry[j][0] != null) {
                        System.out.print(j + "-[Student ID :" + arry[j][0] + " | Student Name :" + arry[j][1] + " | password :" + arry[j][2] + " | Departmant :" + arry[j][3] + " | Address :" + arry[j][4] + " | Age :" + arry[j][5] + " | Phone :" + arry[j][6] + " | Avaergae :" + arry[j][7] + "]");
                    }

                }
            }

        }
    }

    ////////////////////////////update/////////////////
    public static void upDate() {
        int inpt;
        do {
            System.out.println("-------------- Choose the thing you want to UPdDATE all to it");
            System.out.println("1-upDate All Departmamts ");
            System.out.println("2-upDate All Course");
            System.out.println("3-upDate All Instructor");
            System.out.println("4-upDate All Student");
            System.out.println("5-Exit ");
            inpt = input.nextInt();
            switch (inpt) {
                case 1:
                    System.out.println("Enter Deprtment ID : ");
                    String target = "";
                    int index = 0;
                    boolean check = upDateArryaCheck(departmentA, target, index);
                    if (check) {
                        System.out.print("Enter Department Name :");
                        departmentA[index][1] = input.next();
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }
                    break;

                case 2:
                    System.out.println("Enter course ID:");
                    String targetc = "";
                    int indexc = 0;
                    boolean checkc = upDateArryaCheck(courseA, targetc, indexc);
                    if (checkc) {
                        System.out.println("Enter Coures ID :");
                        courseA[indexc][0] = input.next();
                        input.nextLine();

                        System.out.println("Enter Coures Name :");
                        courseA[indexc][1] = input.nextLine();

                        System.out.println("Enter Coures code :");
                        courseA[indexc][2] = input.next();

                        System.out.println("Enter Coures Number of Hours :");
                        courseA[indexc][3] = input.next();

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }
                    break;

                case 3:
                    System.out.println("Enter insrtuctor ID:");
                    String targeti = "";
                    int indexi = 0;
                    boolean checki = upDateArryaCheck(instructorA, targeti, indexi);
                    if (checki) {

                        System.out.println("Enter Instructor ID :");
                        instructorA[indexi][0] = input.next();
                        input.nextLine();

                        System.out.println("Enter Instructor Name :");
                        instructorA[indexi][1] = input.next();

                        System.out.println("Enter Instructor password :");
                        instructorA[indexi][2] = input.next();
                        input.nextLine();

                        showDepartments();
                        int deparmentRow = input.nextInt();
                        instructorA[indexi][3] = departmentA[deparmentRow][1];

                        System.out.println("Enter Instructor Addres   :");
                        instructorA[indexi][4] = input.next();

                        System.out.println("Enter Instructor Age   :");
                        instructorA[indexi][5] = input.next();

                        System.out.println("Enter Instructor Phone   :");
                        instructorA[indexi][6] = input.next();

                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }
                    break;

                case 4:
                    System.out.println("Enter srudent ID:");
                    String targets = "";
                    int indexs = 0;
                    boolean checks = upDateArryaCheck(studentA, targets, indexs);
                    if (checks) {

                        System.out.println("Enter Student ID :");
                        studentA[indexs][0] = input.next();
                        input.nextLine();

                        System.out.println("Enter Student Name :");
                        studentA[indexs][1] = input.nextLine();

                        System.out.println("Enter Student password :");
                        studentA[indexs][2] = input.next();

                        showDepartments();
                        int deparmentRow = input.nextInt();
                        studentA[indexs][3] = departmentA[deparmentRow][1];
                        System.out.println("Enter Student Addres : :");
                        studentA[indexs][4] = input.nextLine();

                        System.out.println("Enter Student Age : :");
                        studentA[indexs][5] = input.next();

                        System.out.println("Enter Student Phone : :");
                        studentA[indexs][6] = input.next();
                        studentA[indexs][7] = "0.0";
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }

                    break;

                default:
                    System.out.println("wrong option!!");
            }
        } while (5 != inpt);

    }

    public static boolean upDateArryaCheck(String[][] arry, String target, int index) {

        target = input.next();
        int lang = arry.length;

        boolean notFound = false;

        for (int i = 0; i < lang; i++) {
            for (int j = 0; j < 2; j++) {
                if (target.equals(arry[i][0])) {
                    index = i;
                    return true;
                } else {

                    notFound = true;
                }

            }
        }
        if (notFound) {
            System.out.println(" Sorry , the Data is incorrect");

        }
        return false;
    }
    ///////////////////////////////////////////////////////////////////

    ///////////////////////// Delete ////////////////////////////////
    public static void delete() {
        int braks;
        do {
            System.out.println("------------- Choose the thing you want to Delete to it");
            System.out.println("1-Delete Departnet");
            System.out.println("2-Delete Course");
            System.out.println("3-Delete Instuctor");
            System.out.println("4-Delete Student");
            System.out.println("5-Exit ");
            braks = input.nextInt();
            switch (braks) {
                case 1:
                    System.out.println("------------Delete Departnet-----------");
                    System.out.println("Enter Departnet ID:");
                    String target = "";
                    int index = 0;
                    boolean check = upDateArryaCheck(departmentA, target, index);
                    if (check) {
                        departmentA = removeRowFrom2dArray(departmentA, index);
//                    
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }
                    break;

                case 2:
                    System.out.println("--------------Delete Course-----------");
                    System.out.println("Enter Course ID:");
                    String targetC = "";
                    int indexC = 0;

                    boolean checkC = upDateArryaCheck(courseA, targetC, indexC);
                    if (checkC) {
                        courseA = removeRowFrom2dArray(courseA, indexC);
//                    
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }

                    break;

                case 3:
                    System.out.println("---------------Delete Instuctor----------");
                    System.out.println("Enter Instuctor ID:");
                    String targeti = "";
                    int indexi = 0;

                    boolean checki = upDateArryaCheck(instructorA, targeti, indexi);
                    if (checki) {
                        instructorA = removeRowFrom2dArray(instructorA, indexi);
//                    
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }

                    break;

                case 4:
                    System.out.println("-----------Delete Student-----------");
                    System.out.println("Enter Student ID:");
                    String targets = "";
                    int indexs = 0;

                    boolean checks = upDateArryaCheck(studentA, targets, indexs);
                    if (checks) {
                        courseA = removeRowFrom2dArray(studentA, indexs);
//                    
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                        System.out.println("^   Success Proccess    ^");
                        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                    }

                    break;
                default:
                    System.out.println("wrong option!!");
            }

        } while (braks != 5);

    }

    public static String[][] removeRowFrom2dArray(String[][] array, int row) {
        int rows = array.length;
        String[][] arrayToReturn = new String[rows - 1][];
        for (int i = 0; i < row; i++) {
            arrayToReturn[i] = array[i];
        }
        for (int i = row; i < arrayToReturn.length; i++) {
            arrayToReturn[i++] = array[i];
        }
        return arrayToReturn;
    }

    ///////////////////////////////  search///////////////////////////////////////
    public static void search() {
        boolean ok = true;

        while (ok) {
            System.out.println("------------- Choose the thing you want to Saerch :");
            System.out.println("1-Saerch Departnet");
            System.out.println("2-Saerch Course");
            System.out.println("3-Saerch Instuctor");
            System.out.println("4-Saerch Student");
            System.out.println("5-Exit ");
            int choose = input.nextInt();
            String id = "";

            switch (choose) {
                case 1:
                    System.out.println("--------- Search Departnet ------");
                    System.out.println("Enter Departnet ID:");
                    id = input.next();
                    boolean m = true;
                    for (int i = 0; i < departmantRowlength; i++) {
                        String depa = departmentA[i][0];
                        if (depa.equals(id)) {
                            System.out.println(departmentA[i][0]);
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            System.out.println("^   Success Proccess    ^");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            m = false;
                            break;
                        }

                    }
                    if (m) {
                        System.out.println(" Sorry , the Data is incorrect");
                    }
                    break;

                case 2:
                    System.out.println("--------- Search Course ------");
                    System.out.println("Enter Course ID:");
                    id = input.next();
                    boolean mm = true;
                    for (int i = 0; i < courseRowlength; i++) {
                        String cou = courseA[i][0];
                        if (cou.equalsIgnoreCase(id)) {
                            System.out.println(i + "-[Course ID :" + courseA[i][0] + "| Name :" + courseA[i][1] + "| code :" + courseA[i][2] + "| Hour : " + courseA[i][30] + "]");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            System.out.println("^   Success Proccess    ^");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            mm = false;
                            break;
                        }

                    }
                    if (mm) {
                        System.out.println(" Sorry , the Data is incorrect");
                    }
                    break;
                case 3:
                    System.out.println("--------- Search Instuctor ------");
                    System.out.println("Enter Instuctor ID:");
                    id = input.next();
                    boolean mmm = true;
                    for (int i = 0; i < insrtuctorRowlength; i++) {
                        String inst = instructorA[i][0];
                        if (inst.equals(id)) {
                            System.out.print(i + "-[Insrtuctor ID :" + instructorA[i][0] + " | Insrtuctor Name :" + instructorA[i][1] + " | password :" + instructorA[i][2] + " | Departmant :" + instructorA[i][3] + " | Address :" + instructorA[i][4] + " | Age :" + instructorA[i][5] + " | Phone :" + instructorA[i][6] + "]");

                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            System.out.println("^   Success Proccess    ^");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            mmm = false;
                            break;
                        }

                    }
                    if (mmm) {
                        System.out.println(" Sorry , the Data is incorrect");
                    }
                    break;
                case 4:
                    System.out.println("--------- Search Student ------");
                    System.out.println("Enter Student ID:");
                    id = input.next();
                    boolean mmmm = true;
                    for (int i = 0; i < studentRowlength; i++) {
                        String stud = studentA[i][0];
                        if (stud.equals(id)) {
                            System.out.print(i + "-[Student ID :" + studentA[i][0] + " | Student Name :" + studentA[i][1] + " | password :" + studentA[i][2] + " | Departmant :" + studentA[i][3] + " | Address :" + studentA[i][4] + " | Age :" + studentA[i][5] + " | Phone :" + studentA[i][6] + "]");

                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            System.out.println("^   Success Proccess    ^");
                            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                            mmmm = false;
                            break;
                        }

                    }

                    if (mmmm) {
                        System.out.println(" Sorry , the Data is incorrect");
                    }
                    break;
                case 5:
                    ok = false;
                    break;

            }

        }
    }

    ////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////INSRUCTOR CODE /////////////////////////////
    ////////////////???//////////////////////////////////////////////////////////
    public static void instructor() {
        System.out.println("============ Welcome Instrutcor =========");
        System.out.println("Enter UserName: ");
        String userName = input.next();
        System.out.println("Enter Password: ");
        String password = input.next();

        int userIndex = loginCheck(instructorA, userName, password);
        String instrcourID = instructorA[userIndex][0];
        if (-1 != userIndex) {
            int choose;
            do {
                System.out.println("========= Welcome " + userName + "===========");
                System.out.println("1-Show All Student in all course");
                System.out.println("2-Show All Student in specifiec course");
                System.out.println("3-Show Coruse");
                System.out.println("4-Search Student");
                System.out.println("5-Set Grade");
                System.out.println("6-Profile");
                System.out.println("7-Exit");
                choose = input.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("--------Show All Student in all course-----------");
                        String idd = input.next();
                        for (int i = 0; i < isa; i++) {
                            if (idd.equals(courseRegesdr[i][2])) {
                                for (int j = 0; j < insrtuctorRegesdrRowlength; j++) {
                                    if (courseRegesdr[i][0].equals(studentA[1][0])) {
                                        System.out.println("123123");
                                    }

                                }
                            }

                        }

                        //  showArrya(courseRegesdr);
                        break;
                    case 2:
                        System.out.println("------------Show All Student in course----------");
                        System.out.println("Enter Course id: ");
                        showSpecifiecCourse();
                        break;
                    case 3:

                        for (int i = 0; i < courseAssing.length; i++) {
                            System.out.print(i + "-");
                            for (int j = 0; j < courseAssing[0].length; j++) {
                                if (instrcourID.equals(courseAssing[i][4])) {
                                    System.out.print(" | " + courseAssing[i][j]);

                                }
                            }
                            System.out.println("");
                        }

                        break;
                    case 4:
                        System.out.println("--------- Search Student ------");
                        System.out.println("Enter Student ID:");
                        String id = input.next();
                        boolean mmmm = true;
                        for (int i = 0; i < studentRowlength; i++) {
                            String stud = studentA[i][0];
                            if (stud.equals(id)) {
                                System.out.print(i + "-[Student ID :" + studentA[i][0] + " | Student Name :" + studentA[i][1] + " | password :" + studentA[i][2] + " | Departmant :" + studentA[i][3] + " | Address :" + studentA[i][4] + " | Age :" + studentA[i][5] + " | Phone :" + studentA[i][6] + "]");

                                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                System.out.println("^   Success Proccess    ^");
                                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                mmmm = false;
                                break;
                            }

                        }

                        if (mmmm) {
                            System.out.println(" Sorry , the Data is incorrect");
                        }
                    case 5:
                        System.out.println("------- Set Grade ------");//++
                        System.out.println("Enter Course id: ");
                        String courseID = input.next();
                        boolean haveAcsid = towValInTowArrya(courseAssing, courseID, 0, courseAssing, instrcourID, 4);
                        if (haveAcsid) {

                            addGrade(courseRegesdr, courseID);

                        } else {
                            System.out.println(" the data is incorrect ///");
                        }
                        break;
                    case 6:
                        showProfile(instructorA, instrcourID);

                        break;
                    default:
                        System.out.println("inter form mainu");
                }

            } while (choose != 7);

        } else {

            System.out.println("??? Sorry , the data is incorrect");
        }

    }

    public static int loginCheck(String[][] arry, String userName, String password) {

        int lang = arry.length;
        int langOfclom = arry[0].length;

        int index = -1;

        for (int i = 0; i < lang; i++) {
            for (int j = 0; j < langOfclom; j++) {
                if (userName.equals(arry[i][1]) && password.equals(arry[i][2])) {
                    index = i;
                    return index;

                }

            }
        }

        return index;
    }

    public static void showProfile(String[][] arry, String ID) {
        int lang = arry.length;
        int langc = arry[0].length;
        for (int i = 0; i < lang; i++) {
            for (int j = 0; j < 2; j++) {
                if (ID.equals(arry[i][0])) {
                    System.out.print(i + "-");
                    for (int k = 0; k < langc; k++) {

                        System.out.print(arry[i][k] + "  | ");

                        break;
                    }

                }

            }
        }
    }

    public static void showSpecifiecCourse() {

        String idCourse = input.next();
        int indexofID = 0;
        boolean isInRegest = false,
                isInAssing = false;

        for (int i = 0; i < courseRegesdr.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (idCourse.equals(courseRegesdr[i][0])) {
                    isInRegest = true;
                    indexofID = i;
                    break;
                }
            }

        }////////////////////

        for (int i = 0; i < courseAssing.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (idCourse.equals(courseAssing[i][0])) {
                    isInAssing = true;
                    break;
                }
            }

        }
        if (isInAssing && isInRegest) {
            for (int i = 0; i < courseRegesdr.length; i++) {
                System.out.print(i + "-");
                for (int j = 0; j < courseRegesdr[0].length; j++) {
                    System.out.print(" | " + courseRegesdr[indexofID][j]);
                }
                System.out.println("");
            }
            System.out.println("");
        } else {

            System.out.println(" Sorry , the date is incorret");
        }

    }

    public static void addGrade(String[][] args, String corsID) {
        int longar = args.length;
        int rowlong = args[0].length;
        for (int i = 0; i < longar; i++) {
            for (int j = 0; j < rowlong; j++) {
                if (corsID.equals(args[i][8])) {
                    System.out.print(i + "-");
                    System.out.println(args[i][j]);
                    System.out.println("Enter Grade: ");
                    String newVal = input.next();
                    args[i][7] = newVal;
                }
            }
        }

    }

    public static boolean towValInTowArrya(String[][] arryOne, String valOne, int clumnArOne, String[][] arryaTow, String valTow, int clumeArTow) {
        boolean resalt = false, arryoneResalt = false, arrytowResalt = false;
        int longInArrOne = arryOne.length;
        int rowlongInArrOne = arryOne[0].length;
        int longInArrTow = arryaTow.length;
        int rowlongInArrTow = arryaTow[0].length;

        for (int i = 0; i < longInArrOne; i++) {
            for (int j = 0; j < rowlongInArrOne; j++) {
                if (valOne.equals(arryOne[i][clumnArOne])) {
                    arryoneResalt = true;
                    break;

                }
            }
        }

        for (int i = 0; i < longInArrTow; i++) {
            for (int j = 0; j < rowlongInArrTow; j++) {
                if (valTow.equals(arryaTow[i][clumeArTow])) {
                    arrytowResalt = true;
                    break;

                }
            }
        }
        if (arryoneResalt && arrytowResalt) {
            resalt = true;
        }
        return resalt;
    }

    ////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////student CODE /////////////////////////////
    ////////////////???//////////////////////////////////////////////////////////
    public static void student() {

        System.out.println("============ Welcome Student =========");
        System.out.println("Enter UserName: ");
        String userName = input.next();
        System.out.println("Enter Password: ");
        String password = input.next();

        int userIndex = loginCheck(studentA, userName, password);
        String studentID = studentA[userIndex][0];
        if (-1 != userIndex) {
            int choose;
            do {
                System.out.println("========= Welcome " + userName + "===========");
                System.out.println("1-Register course");
                System.out.println("2-Show All Registered course");
                System.out.println("3-Delete Coruse");
                System.out.println("4-Avaerage");
                System.out.println("5-Profile ");
                System.out.println("6-Exit");
                choose = input.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("--------register course-----------");
                        showArrya(courseA);
                        System.out.print("Enter Course id :");
                        String coutseID = input.next();
                        boolean idOfCoursIsCorrect = checkValInArrya(courseA, coutseID);
                        boolean studentIsRegist = registerArryaCheck(courseRegesdr, studentID, coutseID);

                        if (studentIsRegist) {
                            System.out.println("!!!! your is realy register in thes course  !!!!");

                        } else {
                            if (idOfCoursIsCorrect) {
                                //add

                                int langRow = courseRegesdr[0].length - 1;
                                for (int i = 0; i < 1; i++) {
                                    for (int j = 0; j < langRow; j++) {
                                        courseRegesdr[courseRegesdrRowlength][j] = studentA[userIndex][j];
                                        courseRegesdr[courseRegesdrRowlength][7] = coutseID;
                                    }
//                                courseRegesdr[courseRegesdrRowlength][0] = studentA[userIndex][0];
//                                courseRegesdr[courseRegesdrRowlength][1] = studentA[userIndex][1];
//                                courseRegesdr[courseRegesdrRowlength][2] = studentA[userIndex][2];
//                                courseRegesdr[courseRegesdrRowlength][3] = studentA[userIndex][3];
//                                courseRegesdr[courseRegesdrRowlength][4] = studentA[userIndex][4];
//                                courseRegesdr[courseRegesdrRowlength][5] = studentA[userIndex][5];

                                }

                                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                                System.out.println("^   Success Proccess    ^");
                                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

                            } else {

                                System.out.println(" Sorry , the data is incorrect");
                            }

                        }

                        break;
                    case 2:
                        System.out.println("------------Show All Registered course----------");

                        showStudRegistCourse(studentID);
                        break;
                    case 3:

                        showStudRegistCourse(studentID);
                        System.out.println("Enter ID Course to Delete it : ");
                        String coutseIDdele = input.next();
                        deleteCourse(courseRegesdr, coutseIDdele, studentID);

                        break;
                    case 4:

                        for (int i = 0; i < courseRegesdr.length; i++) {
                            System.out.println(i + "-");

                            if (studentID.equals(courseRegesdr[i][0])) {
                                System.out.println("Avaerage :" + courseRegesdr[i][7]);

                            }

                        }

                        break;
                    case 5:
                        showProfile(studentA, studentID);
                        break;

                    default:
                        System.out.println("inter form mainu");
                }

            } while (choose != 6);

        } else {

            System.out.println("??? Sorry , the data is incorrect");
        }

    }

    public static boolean registerArryaCheck(String[][] arry, String studentID, String courseID) {

        int lang = arry.length;
        for (int i = 0; i < lang; i++) {

            if (studentID.equals(arry[i][0]) && courseID.equals(arry[i][8])) {

                return true;

            }

        }

        return false;
    }

    public static boolean checkValInArrya(String[][] arry, String val) {
        int lang = arry.length;

        for (int i = 0; i < lang; i++) {
            for (int j = 0; j < 2; j++) {
                if (val.equals(arry[i][0])) {

                    return true;

                }

            }
        }

        return false;
    }

    //course
    public static void showStudRegistCourse(String studentID) {
        int crl = courseRegesdr.length;
        int crlclom = courseA.length;
        int corcrow = courseA[0].length;
        for (int i = 0; i < crl; i++) {
            for (int j = 0; j < crlclom; j++) {
                if (studentID.equals(courseRegesdr[i][0]) && courseRegesdr[i][0] != null) {
                    if (courseRegesdr[i][7].equals(courseA[j][0])) {
                        for (int k = 0; k < corcrow; k++) {
                            System.out.print(i + "[" + courseA[j][k] + " | ");

                        }
                        System.out.println(courseRegesdr[i][6] + " \n");
                    }
                }
            }

        }

    }

    public static void deleteCourse(String[][] args, String courseID, String studentID) {
        int rowlog = args.length;
        int clomlog = args[0].length;
        for (int i = 0; i < rowlog; i++) {
            if (studentID.equals(args[i][0]) && courseID.equals(args[i][8])) {
                for (int j = 0; j < clomlog; j++) {
                    args[i][j] = null;

                }
            }
        }
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^   Success Proccess    ^");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    }
}
