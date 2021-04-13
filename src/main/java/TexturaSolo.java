


public enum TexturaSolo {
    
    ARGILOSO {
        public TipoNutrientes calculaValorIdeal() {
            return new TipoNutrientes(9.0, 0.35, 6.0, 1.5, 9.0, 0.0, 0.0);
        }
    },

    TEXTURA_MEDIA{
        public TipoNutrientes calculaValorIdeal() {
            return new TipoNutrientes(12.0, 0.25, 3.0, 1.0, 6.0, 0.0, 0.0);
        }
    };
    
    public abstract TipoNutrientes calculaValorIdeal();
}
