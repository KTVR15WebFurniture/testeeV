package parts;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "worker")
public class Worker implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;  //для базы данных, заполняется автоматически
    private String name;   //имя работника
    private String surname; //фамилия работника
    private String idCode; //код паспорта
//    private Double salary;  //зарплата по договору
//    private String role; //роль сотрудника 

    public Worker() {
    }

    public Worker(String name, String surname, String idCode) {
        this.name = name;
        this.surname = surname;
        this.idCode = idCode;
    }

    public String getEmpName() {
        return name;
    }

    public void setEmpName(String name) {
        this.name = name;
    }

    public String getEmpSurname() {
        return surname;
    }

    public void setEmpSurname(String surname) {
        this.surname = surname;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.name);
        hash = 19 * hash + Objects.hashCode(this.surname);
        hash = 19 * hash + Objects.hashCode(this.idCode);
//        hash = 19 * hash + Objects.hashCode(this.salary);
//        hash = 19 * hash + Objects.hashCode(this.role);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Worker other = (Worker) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.idCode, other.idCode)) {
            return false;
        }
//        if (!Objects.equals(this.role, other.role)) {
//            return false;
//        }
//        if (!Objects.equals(this.salary, other.salary)) {
//            return false;
//        }
        return true;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", surname=" + surname + ", idCode=" + idCode + 
//                ", salary=" + salary + ", role=" + role + 
                '}';
    }

    
}
