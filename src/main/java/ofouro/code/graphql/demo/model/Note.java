package ofouro.code.graphql.demo.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.time.ZonedDateTime;

@Entity
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Note extends BaseEntity {

    @NonNull
    private String note;

    private ZonedDateTime createdOn;

    @ManyToOne(fetch = FetchType.EAGER)
    private Person author;


}
