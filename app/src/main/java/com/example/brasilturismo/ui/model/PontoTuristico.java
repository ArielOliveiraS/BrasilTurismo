package com.example.brasilturismo.ui.model;

import android.os.Parcel;
import android.os.Parcelable;

public class PontoTuristico implements Parcelable {
    private int imagemBanner;
    private String nomeEstado;
    private String capitalEstado;
    private String destaqueEstado;

    protected PontoTuristico(Parcel in) {
        imagemBanner = in.readInt();
        nomeEstado = in.readString();
        capitalEstado = in.readString();
        destaqueEstado = in.readString();

    }

    public int getImagemBanner() {
        return imagemBanner;
    }

    public void setImagemBanner(int imagemBanner) {
        this.imagemBanner = imagemBanner;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getCapitalEstado() {
        return capitalEstado;
    }

    public void setCapitalEstado(String capitalEstado) {
        this.capitalEstado = capitalEstado;
    }

    public String getDestaqueEstado() {
        return destaqueEstado;
    }

    public void setDestaqueEstado(String destaqueEstado) {
        this.destaqueEstado = destaqueEstado;
    }

    public static final Creator<PontoTuristico> CREATOR = new Creator<PontoTuristico>() {
        @Override
        public PontoTuristico createFromParcel(Parcel in) {
            return new PontoTuristico(in);
        }

        @Override
        public PontoTuristico[] newArray(int size) {
            return new PontoTuristico[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagemBanner);
        dest.writeString(nomeEstado);
        dest.writeString(capitalEstado);
        dest.writeString(destaqueEstado);
    }
}
