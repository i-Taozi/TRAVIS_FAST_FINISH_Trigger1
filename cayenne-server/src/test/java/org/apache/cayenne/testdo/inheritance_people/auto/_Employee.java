package org.apache.cayenne.testdo.inheritance_people.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.testdo.inheritance_people.AbstractPerson;
import org.apache.cayenne.testdo.inheritance_people.Address;
import org.apache.cayenne.testdo.inheritance_people.Department;

/**
 * Class _Employee was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Employee extends AbstractPerson {

    private static final long serialVersionUID = 1L; 

    public static final NumericProperty<Integer> PERSON_ID_PK_PROPERTY = PropertyFactory.createNumeric(ExpressionFactory.dbPathExp("PERSON_ID"), Integer.class);
    public static final String PERSON_ID_PK_COLUMN = "PERSON_ID";

    public static final NumericProperty<Float> SALARY = PropertyFactory.createNumeric("salary", Float.class);
    public static final ListProperty<Address> ADDRESSES = PropertyFactory.createList("addresses", Address.class);
    public static final EntityProperty<Department> TO_DEPARTMENT = PropertyFactory.createEntity("toDepartment", Department.class);

    protected Float salary;

    protected Object addresses;
    protected Object toDepartment;

    public void setSalary(Float salary) {
        beforePropertyWrite("salary", this.salary, salary);
        this.salary = salary;
    }

    public Float getSalary() {
        beforePropertyRead("salary");
        return this.salary;
    }

    public void addToAddresses(Address obj) {
        addToManyTarget("addresses", obj, true);
    }

    public void removeFromAddresses(Address obj) {
        removeToManyTarget("addresses", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<Address> getAddresses() {
        return (List<Address>)readProperty("addresses");
    }

    public void setToDepartment(Department toDepartment) {
        setToOneTarget("toDepartment", toDepartment, true);
    }

    public Department getToDepartment() {
        return (Department)readProperty("toDepartment");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "salary":
                return this.salary;
            case "addresses":
                return this.addresses;
            case "toDepartment":
                return this.toDepartment;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "salary":
                this.salary = (Float)val;
                break;
            case "addresses":
                this.addresses = val;
                break;
            case "toDepartment":
                this.toDepartment = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.salary);
        out.writeObject(this.addresses);
        out.writeObject(this.toDepartment);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.salary = (Float)in.readObject();
        this.addresses = in.readObject();
        this.toDepartment = in.readObject();
    }

}
