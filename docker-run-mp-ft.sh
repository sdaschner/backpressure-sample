#!/bin/bash
set -euo pipefail

docker stop backpressure-sample || true

docker run --rm -d \
  -p 9080:9080 \
  -p 9443:9443 \
  --name backpressure-sample \
  sdaschner/backpressure-sample:1
