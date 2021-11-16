package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return even when number input is even"
    request{
        method GET()
        url($(regex("/users/\\d")))
        headers {
            headers.accept(headers.applicationJson())
        }
    }
    response {
        headers {
            headers.contentType(headers.applicationJson())
        }
        body([
                "id": fromRequest().path(1),
                "name": $(anyNonBlankString())
        ])
        status 200
    }
}
