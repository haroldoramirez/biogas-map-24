package models;

import java.util.List;

public class EnvelopeDeUnidades {

    /*-------------------------------------------------------------------
     *	ATTRIBUTES
     *-------------------------------------------------------------------*/

    private List<Unidade> unidades;

    /*-------------------------------------------------------------------
     *	CONSTRUCTOR
     *-------------------------------------------------------------------*/

    public EnvelopeDeUnidades(List<Unidade> unidades) {
        this.unidades = unidades;
    }

    /*-------------------------------------------------------------------
     *	GETTERS AND SETTERS
     *-------------------------------------------------------------------*/

    public List<Unidade> getUnidades() {
        return unidades;
    }
}
