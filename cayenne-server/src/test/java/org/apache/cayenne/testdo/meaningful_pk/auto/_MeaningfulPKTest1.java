package org.apache.cayenne.testdo.meaningful_pk.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.property.ListProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.meaningful_pk.MeaningfulPKDep;

/**
 * Class _MeaningfulPKTest1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _MeaningfulPKTest1 extends BaseDataObject {

    private static final long serialVersionUID = 1L;

    public static final String PK_ATTRIBUTE_PK_COLUMN = "PK_ATTRIBUTE";

    public static final StringProperty<String> DESCR = PropertyFactory.createString("descr", String.class);
    public static final NumericProperty<Integer> INT_ATTRIBUTE = PropertyFactory.createNumeric("intAttribute", Integer.class);
    public static final NumericProperty<Integer> INT_NULLABLE_ATTRIBUTE = PropertyFactory.createNumeric("intNullableAttribute", Integer.class);
    public static final NumericProperty<Integer> PK_ATTRIBUTE = PropertyFactory.createNumeric("pkAttribute", Integer.class);
    public static final ListProperty<MeaningfulPKDep> MEANINGFUL_PKDEP_ARRAY = PropertyFactory.createList("meaningfulPKDepArray", MeaningfulPKDep.class);

    protected String descr;
    protected int intAttribute;
    protected Integer intNullableAttribute;
    protected int pkAttribute;

    protected Object meaningfulPKDepArray;

    public void setDescr(String descr) {
        beforePropertyWrite("descr", this.descr, descr);
        this.descr = descr;
    }

    public String getDescr() {
        beforePropertyRead("descr");
        return this.descr;
    }

    public void setIntAttribute(int intAttribute) {
        beforePropertyWrite("intAttribute", this.intAttribute, intAttribute);
        this.intAttribute = intAttribute;
    }

    public int getIntAttribute() {
        beforePropertyRead("intAttribute");
        return this.intAttribute;
    }

    public void setIntNullableAttribute(int intNullableAttribute) {
        beforePropertyWrite("intNullableAttribute", this.intNullableAttribute, intNullableAttribute);
        this.intNullableAttribute = intNullableAttribute;
    }

    public int getIntNullableAttribute() {
        beforePropertyRead("intNullableAttribute");
        if(this.intNullableAttribute == null) {
            return 0;
        }
        return this.intNullableAttribute;
    }

    public void setPkAttribute(int pkAttribute) {
        beforePropertyWrite("pkAttribute", this.pkAttribute, pkAttribute);
        this.pkAttribute = pkAttribute;
    }

    public int getPkAttribute() {
        beforePropertyRead("pkAttribute");
        return this.pkAttribute;
    }

    public void addToMeaningfulPKDepArray(MeaningfulPKDep obj) {
        addToManyTarget("meaningfulPKDepArray", obj, true);
    }

    public void removeFromMeaningfulPKDepArray(MeaningfulPKDep obj) {
        removeToManyTarget("meaningfulPKDepArray", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<MeaningfulPKDep> getMeaningfulPKDepArray() {
        return (List<MeaningfulPKDep>)readProperty("meaningfulPKDepArray");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "descr":
                return this.descr;
            case "intAttribute":
                return this.intAttribute;
            case "intNullableAttribute":
                return this.intNullableAttribute;
            case "pkAttribute":
                return this.pkAttribute;
            case "meaningfulPKDepArray":
                return this.meaningfulPKDepArray;
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
            case "descr":
                this.descr = (String)val;
                break;
            case "intAttribute":
                this.intAttribute = val == null ? 0 : (int)val;
                break;
            case "intNullableAttribute":
                this.intNullableAttribute = (Integer)val;
                break;
            case "pkAttribute":
                this.pkAttribute = val == null ? 0 : (int)val;
                break;
            case "meaningfulPKDepArray":
                this.meaningfulPKDepArray = val;
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
        out.writeObject(this.descr);
        out.writeInt(this.intAttribute);
        out.writeObject(this.intNullableAttribute);
        out.writeInt(this.pkAttribute);
        out.writeObject(this.meaningfulPKDepArray);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.descr = (String)in.readObject();
        this.intAttribute = in.readInt();
        this.intNullableAttribute = (Integer)in.readObject();
        this.pkAttribute = in.readInt();
        this.meaningfulPKDepArray = in.readObject();
    }

}
