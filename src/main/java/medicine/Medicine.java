package medicine;

import java.util.Objects;

public record Medicine(String product_id, String original_name, String legal_status, String strength,
                       String pharmaceutical_form, String active_substance, String manufacturer, String atc_code,
                       String product_price_without_vat_eur) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicine medicine = (Medicine) o;
        return Objects.equals(product_id, medicine.product_id) && Objects.equals(original_name, medicine.original_name) && Objects.equals(legal_status, medicine.legal_status) && Objects.equals(strength, medicine.strength) && Objects.equals(pharmaceutical_form, medicine.pharmaceutical_form) && Objects.equals(active_substance, medicine.active_substance) && Objects.equals(manufacturer, medicine.manufacturer) && Objects.equals(atc_code, medicine.atc_code) && Objects.equals(product_price_without_vat_eur, medicine.product_price_without_vat_eur);
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "product_id='" + product_id + '\'' +
                ", original_name='" + original_name + '\'' +
                ", legal_status='" + legal_status + '\'' +
                ", strength='" + strength + '\'' +
                ", pharmaceutical_form='" + pharmaceutical_form + '\'' +
                ", active_substance='" + active_substance + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", atc_code='" + atc_code + '\'' +
                ", product_price_without_vat_eur='" + product_price_without_vat_eur + '\'' +
                '}';
    }
}
