package com.banking.cqrs.core.events;

import com.banking.cqrs.core.messages.Message;
import lombok.*;
import lombok.experimental.SuperBuilder;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Setter
@Getter
public abstract class BaseEvent extends Message {
    private int version;
}
