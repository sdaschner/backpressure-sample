#!/bin/bash
set -euo pipefail

fortio load -c 50 -qps 5000 -t 30s -loglevel Warning http://localhost:9080/ft-reproducer/resources/test/1
