package org.aecc.superdiary.domain.interactor.contact;


import org.aecc.superdiary.domain.Contact;
import org.aecc.superdiary.domain.exception.ErrorBundle;
import org.aecc.superdiary.domain.interactor.Interactor;

public interface SaveContactUseCase extends Interactor{

    interface Callback {
        void onContactDataSaved(Contact contact);
        void onError(ErrorBundle errorBundle);
    }


    public void execute(Contact contact, Callback callback);

}
