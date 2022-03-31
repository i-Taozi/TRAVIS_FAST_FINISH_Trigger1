package org.apache.cayenne.testdo.deleterules.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.ExpressionFactory;
import org.apache.cayenne.exp.property.EntityProperty;
import org.apache.cayenne.exp.property.NumericProperty;
import org.apache.cayenne.exp.property.PropertyFactory;
import org.apache.cayenne.exp.property.StringProperty;
import org.apache.cayenne.testdo.deleterules.DeleteRule;

/**
 * Class _DeleteDeny was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _DeleteDeny extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final NumericProperty<Integer> DELETE_DENY_ID_PK_PROPERTY = PropertyFactory.createNumeric(ExpressionFactory.dbPathExp("DELETE_DENY_ID"), Integer.class);
    public static final String DELETE_DENY_ID_PK_COLUMN = "DELETE_DENY_ID";

    public static final StringProperty<String> NAME = PropertyFactory.createString("name", String.class);
    public static final EntityProperty<DeleteRule> DENY = PropertyFactory.createEntity("deny", DeleteRule.class);

    protected String name;

    protected Object deny;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setDeny(DeleteRule deny) {
        setToOneTarget("deny", deny, true);
    }

    public DeleteRule getDeny() {
        return (DeleteRule)readProperty("deny");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "deny":
                return this.deny;
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
            case "name":
                this.name = (String)val;
                break;
            case "deny":
                this.deny = val;
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
        out.writeObject(this.name);
        out.writeObject(this.deny);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.name = (String)in.readObject();
        this.deny = in.readObject();
    }

}
