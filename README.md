# Repo to demonstrate performance issue

Steps to reproduce:

1. Put a breakpoint on `org.springframework.data.mapping.PropertyReferenceException:94`
2. Run program

Observed behavior: 

Attempting to retrieve property '$in', which is not really a property.

Expected behavior:

No exceptions should be thrown and consumed as a part of the regular query process.