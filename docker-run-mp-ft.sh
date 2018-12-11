#!/bin/bash
set -euo pipefail

docker stop ft-reproducer || true

docker run --rm -d \
  -p 9080:9080 \
  -p 9443:9443 \
  --name ft-reproducer \
  sdaschner/ft-reproducer:1
