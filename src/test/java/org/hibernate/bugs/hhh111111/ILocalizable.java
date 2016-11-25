package org.hibernate.bugs.hhh111111;

import java.io.Serializable;

public interface ILocalizable extends Serializable {

    String getValue();

    void setValue(String value);

}
