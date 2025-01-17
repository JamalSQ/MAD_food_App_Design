// Generated by view binder compiler. Do not edit!
package com.example.mobileappproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mobileappproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegPgNo10Binding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnSignInPg10;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final EditText emailEditText;

  @NonNull
  public final EditText etFuln;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView tvDetails;

  @NonNull
  public final TextView tvGoogle;

  @NonNull
  public final TextView tvOr;

  @NonNull
  public final TextView tvSignInn;

  @NonNull
  public final TextView tvSignin;

  @NonNull
  public final TextView tvUsed;

  private ActivityRegPgNo10Binding(@NonNull ScrollView rootView, @NonNull Button btnSignInPg10,
      @NonNull EditText editTextTextPassword, @NonNull EditText emailEditText,
      @NonNull EditText etFuln, @NonNull ImageView imageView, @NonNull TextView tvDetails,
      @NonNull TextView tvGoogle, @NonNull TextView tvOr, @NonNull TextView tvSignInn,
      @NonNull TextView tvSignin, @NonNull TextView tvUsed) {
    this.rootView = rootView;
    this.btnSignInPg10 = btnSignInPg10;
    this.editTextTextPassword = editTextTextPassword;
    this.emailEditText = emailEditText;
    this.etFuln = etFuln;
    this.imageView = imageView;
    this.tvDetails = tvDetails;
    this.tvGoogle = tvGoogle;
    this.tvOr = tvOr;
    this.tvSignInn = tvSignInn;
    this.tvSignin = tvSignin;
    this.tvUsed = tvUsed;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegPgNo10Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegPgNo10Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reg_pg_no10, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegPgNo10Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSignInPg10;
      Button btnSignInPg10 = ViewBindings.findChildViewById(rootView, id);
      if (btnSignInPg10 == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.emailEditText;
      EditText emailEditText = ViewBindings.findChildViewById(rootView, id);
      if (emailEditText == null) {
        break missingId;
      }

      id = R.id.et_fuln;
      EditText etFuln = ViewBindings.findChildViewById(rootView, id);
      if (etFuln == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.tv_details;
      TextView tvDetails = ViewBindings.findChildViewById(rootView, id);
      if (tvDetails == null) {
        break missingId;
      }

      id = R.id.tv_google;
      TextView tvGoogle = ViewBindings.findChildViewById(rootView, id);
      if (tvGoogle == null) {
        break missingId;
      }

      id = R.id.tv_or;
      TextView tvOr = ViewBindings.findChildViewById(rootView, id);
      if (tvOr == null) {
        break missingId;
      }

      id = R.id.tv_SignInn;
      TextView tvSignInn = ViewBindings.findChildViewById(rootView, id);
      if (tvSignInn == null) {
        break missingId;
      }

      id = R.id.tv_signin;
      TextView tvSignin = ViewBindings.findChildViewById(rootView, id);
      if (tvSignin == null) {
        break missingId;
      }

      id = R.id.tv_used;
      TextView tvUsed = ViewBindings.findChildViewById(rootView, id);
      if (tvUsed == null) {
        break missingId;
      }

      return new ActivityRegPgNo10Binding((ScrollView) rootView, btnSignInPg10,
          editTextTextPassword, emailEditText, etFuln, imageView, tvDetails, tvGoogle, tvOr,
          tvSignInn, tvSignin, tvUsed);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
