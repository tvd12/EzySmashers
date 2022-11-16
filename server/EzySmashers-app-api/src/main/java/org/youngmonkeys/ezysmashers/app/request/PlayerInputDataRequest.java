package org.youngmonkeys.ezysmashers.app.request;

import com.tvd12.ezyfox.binding.annotation.EzyObjectBinding;
import lombok.Data;

@Data
@EzyObjectBinding
@SuppressWarnings("MemberName")
public class PlayerInputDataRequest {
    int t;
    boolean[] k;
    float[] r;
}
