package com.example.brasilturismo.ui.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Estado implements Parcelable {
        private int imagemEstado;
        private String nomeEstado;

        public Estado(int imagemEstado, String nomeEstado){
            this.imagemEstado = imagemEstado;
            this.nomeEstado = nomeEstado;
        }

    protected Estado(Parcel in) {
            imagemEstado = in.readInt();
            nomeEstado = in.readString();
    }

    public static final Creator<Estado> CREATOR = new Creator<Estado>() {
        @Override
        public Estado createFromParcel(Parcel in) {return new Estado(in);}

        @Override
        public Estado[] newArray(int size) {return new Estado[size];}
    };

    public int getImagemEstado() {
        return imagemEstado;
    }

    public void setImagemEstado(int imagemEstado) {
        this.imagemEstado = imagemEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(imagemEstado);
        dest.writeString(nomeEstado);
    }
}
